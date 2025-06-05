package org.example;


import org.example.models.Users;
import org.example.services.impl.AccountServiceImpl;
import org.example.services.impl.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context= SpringApplication.run(Main.class, args);

        AccountServiceImpl accountService = (AccountServiceImpl) context.getBean("accountServiceImpl");
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userServiceImpl");




    }
}