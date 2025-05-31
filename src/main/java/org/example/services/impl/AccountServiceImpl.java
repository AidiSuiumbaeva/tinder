package org.example.services.impl;

import org.example.dao.DbHelper;
import org.example.dao.DbHelperImpl;
import org.example.models.Account;
import org.example.services.AccountService;
import org.postgresql.util.PSQLException;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
@Service
public class AccountServiceImpl implements AccountService {

    private final DbHelper dbHelper;

    public AccountServiceImpl(DbHelper dbHelper) {
        this.dbHelper = dbHelper;
    }


    @Override
    public void save(Account account) {
        PreparedStatement ps=dbHelper.getStatement("""
         
                insert into tb_accounts(login, password, codeword, status, id_tb_users)
                                     values (?,?,?,?,?)
                """);
        try {
            ps.setString(1,account.getLogin());
            ps.setString(2,account.getPassword());
            ps.setString(3,account.getCodeWord());
            ps.setString(4,account.getStatus().toString());
            ps.setLong(5,account.getUsers().getId());


            ps.executeUpdate();

        }catch (PSQLException e){
            throw new RuntimeException("Введенный логин уже существует. Попробуйте ввести другой");
        }catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException("Произошлка ошибка при сохранении пользователя->"+e.getMessage());
        }
    }

    @Override
    public Account getByLogin(String login) {

        try {
            PreparedStatement ps = dbHelper.getStatement("""
                    select * from tb_accounts a where a.login=?
                    """);
            ps.setString(1, login);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Account account=new Account();
                account.setId(rs.getLong("id"));
                account.setLogin(rs.getString("login"));
                account.setPassword(rs.getString("password"));
                account.setCodeWord(rs.getString("codeword"));
                return account;
            }

        }catch (SQLException e){
            throw  new RuntimeException("Произошла ошибка при получении аккаунта");
        }
        return null;
    }

    public void setDbHelper(String dbHelper) {
    }
}
