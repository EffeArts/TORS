package com.company.TORS;

public class User {
    private int id;
    private String names;
    private String email;

    public User(int id, String names, String email) {
        this.id = id;
        this.names = names;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }
}
