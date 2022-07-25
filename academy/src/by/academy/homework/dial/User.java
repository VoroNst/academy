package by.academy.homework.dial;

import java.util.Date;

public class User {
    private double _money;
    private String _name;
    private String _email;
    private Date _birthDay;
    private String _phone;

    public User(String name,
                double money,
                String email,
                String phone,
                Date birthDay){
        _money = money;
        _name = name;
        _email = email;
        _phone = phone;
        _birthDay = birthDay;
    }

    public String getEmail(){
        return _email;
    }
    public String getPhone(){
        return _phone;
    }
    public Date getbirthDay(){
        return _birthDay;
    }
    public double getMoney(){
        return _money;
    }
    public String getName(){
        return _name;
    }
    public void setMoney(double money){

        _money += money;
    }
    public void pay(double money){
        _money -= money;
    }
}
