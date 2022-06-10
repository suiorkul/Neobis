package com.company;

public class Employer {

    public Employer( String name, String secondName, String phone, String nick, String password) {

        this.name = name;
        this.secondName = secondName;
        this.phone = phone;
        this.nick = nick;
        this.password = password;
    }
    public Employer(){

    }
    private   Cars cars;
    private long id;
    private String name;
    private String secondName;
    private String phone;
    private String nick;
    private String password;


    public Cars getCars() {
        return cars;
    }
    public void setCars(Cars vehicle) {
        this.cars = cars;
    }
    public long getId() {
        return id;
    }

    public Employer setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employer setName(String name) {
        this.name = name;
        return this;
    }

    public String getSecondName() {
        return secondName;
    }

    public Employer setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Employer setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getNick() {
        return nick;
    }

    public Employer setNick(String nick) {
        this.nick = nick;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Employer setPassword(String password) {
        this.password = password;
        return this;
    }
}
