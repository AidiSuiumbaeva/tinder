package org.example.services.impl;

import org.example.dao.DbHelper;
import org.example.dao.DbHelperImpl;
import org.example.models.Account;
import org.example.models.dto.AuthRequest;
import org.example.services.AccountService;
import org.example.services.AuthService;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
@Service
public class AuthServiceImpl implements AuthService {

    public AuthServiceImpl(AccountService accountService) {
        this.accountService = accountService;
    }

    private final AccountService accountService;

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
