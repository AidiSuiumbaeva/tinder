package org.example.services.impl;

import org.example.dao.DbHelper;
import org.example.dao.DbHelperImpl;
import org.example.models.Account;
import org.example.models.dto.AuthRequest;
import org.example.services.AccountService;
import org.example.services.AuthService;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthServiceImpl implements AuthService {

    private AccountService accountService=new AccountServiceImpl();

    @Override
    public String login(AuthRequest request) {

        Account account=accountService.getByLogin(request.login());
        if(account==null || account.getId() == null){
            throw new RuntimeException("Аккаунт не найден по логину");
        }

        if (!account.getPassword().equals(request.password())){
            throw new RuntimeException("Неверный пароль");
        }

        return "Успешно";
    }
}
