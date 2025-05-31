package org.example.services.impl;

import org.example.dao.DbHelper;
import org.example.dao.DbHelperImpl;
import org.example.models.Account;
import org.example.models.Users;
import org.example.models.dto.UserCreateRequest;
import org.example.models.enums.AccountStatus;
import org.example.services.AccountService;
import org.example.services.UserService;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Date;

public class UserServiceImpl implements UserService {

    //todo внедрить зависимости извне

    //сильная зависимость от класса
    //показать слабую зависимость
    private final DbHelper dbHelper=new DbHelperImpl();

    private final AccountService accountService=new AccountServiceImpl();


    @Override
    public Users save(Users user) {


        PreparedStatement ps=dbHelper.getStatement("""
                with inserted as(
                    insert into tb_users( name, gender, age, bio, city,dateofbirth)
                        values (?,?,?,?,?,?) RETURNING id)
                Select id from tb_users
                """);
        try {
            ps.setString(1,user.getName());
            ps.setString(2,user.getGender().toString());
            ps.setInt(3,user.getAge());
            ps.setString(4,user.getBio());
            ps.setString(5,user.getCity());
            ps.setDate(6,user.getBirthDate());


            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                user.setId(rs.getLong("id"));
            }

            return user;

        }catch (SQLException e){
            throw new RuntimeException("Произошлка ошибка при сохранении пользователя->"+e.getMessage());
        }
    }

    @Override
    public Users findByUsername(String username) {
        PreparedStatement ps=dbHelper.getStatement("select * from tb_users where name = ?");

        try {
            ps.setString(1,username);
            ResultSet resultSet=ps.executeQuery();

            while (resultSet.next()){
                Users user=new Users();
                user.setName(resultSet.getString("name"));
                user.setId(resultSet.getLong("id"));
                return user;
            }


        }catch (SQLException e){
            throw new RuntimeException("Произошлка ошибка при получении пользователя->"+e.getMessage());
        }

        return null;
    }

    @Override
    public String createUser(UserCreateRequest request) {

        Users user=new Users();
        user.setName(request.getName());
        user.setAge(request.getAge());
        user.setBio(request.getBio());
        user.setGender(request.getGender());
        user.setBirthDate(request.getBirthday());

        user=save(user);


        Account account=new Account();
        account.setLogin(request.getLogin());
        account.setPassword(request.getPassword());
        account.setCodeWord(request.getCodeWord());
        account.setStatus(AccountStatus.ACTIVE);
        account.setUsers(user);

        accountService.save(account);

        return "Success";
    }
}
