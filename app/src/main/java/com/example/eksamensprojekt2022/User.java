package com.example.eksamensprojekt2022;

public class User {
    int userID = 0;
    String email = "";
    String name = "";
    String password = "";

    public User(int userID, String email, String name, String password) {
        this.userID = userID;
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public User() {
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
