package org.example;

import org.example.dao.DbHelper;
import org.example.dao.DbHelperImpl;
import org.example.models.Users;
import org.example.models.dto.AuthRequest;
import org.example.models.dto.UserCreateRequest;
import org.example.models.enums.Gender;
import org.example.services.AuthService;
import org.example.services.UserService;
import org.example.services.impl.AuthServiceImpl;
import org.example.services.impl.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        передать пол,город, возвраст от и до
        получим список из имен, пола, возраста,биo,город

        * */


//        UserService userService=new UserServiceImpl();
//
//        UserCreateRequest request=new UserCreateRequest();
//
//        request.setAge(34);
//        request.setName("John");
//        request.setBio("mdmfmmf");
//        request.setCity("Bishkek");
//        request.setGender(Gender.MALE);
//        request.setLogin("jane");
//        request.setBirthday(new Date(1997,2,12));
//        String result=userService.createUser(request);
//


//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("tinder-context.xml");
//
//        context.getBean("userService");


//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TinderConfigAppl.class);
    }
//
//@Configuration
//    public class TinderConfigAppl{
//
//        /*
//    Аннотация @Configuration в Spring указывает, что класс содержит конфигурацию бинов —
//     то есть это замена XML-файла конфигурации, но в виде Java-кода.
//        * */
//        @Bean
//    DbHelper dbHelper(){
//            return new DbHelperImpl();
//        }
//
//    }
}