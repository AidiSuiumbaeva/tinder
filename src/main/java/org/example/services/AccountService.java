package org.example.services;

import org.example.models.Account;

public interface AccountService {
    void save(Account account);

    Account getByLogin(String login);

}
