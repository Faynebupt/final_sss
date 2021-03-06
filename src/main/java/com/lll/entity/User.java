package com.lll.entity;

import javax.persistence.*;

/**
 * Created by qaa on 2017/7/11.
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false)
    private String name;
    private int age;
    private String username;
    private String password;

    public User(){
    }
    public User(String name, int age){
        this.name = name;
        this.age = age;
    }
    public User(Long id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return "User:{" +
                "id:" + this.id +
                ",name:" + this.name +
                ",age:" + this.age +
                "}";
    }
}
