package org.example.models;

import org.example.models.enums.Gender;

import java.sql.Date;
import java.time.LocalDate;

public class Users {
    private Long id;
    private String name;
    private Date birthDate;
    private Gender gender;
    private int age;
    private String bio;
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Users(Long id, String name,  Gender gender, int age, String bio) {
        this.id = id;
        this.name = name;

        this.gender = gender;
        this.age = age;
        this.bio = bio;
    }


    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Users() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
