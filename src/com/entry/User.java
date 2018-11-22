package com.entry;

public class User {
    private int id;
    private String name;
    private String pwd;

    public void  setId(int id){this.id = id;}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getId(){return this.id;}

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwd() {
        return pwd;
    }
}
