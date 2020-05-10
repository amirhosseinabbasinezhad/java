package com.company;

public class Student{

    String name;
    String username;
    String password;
public void studentname(String password) throws ExeptionName {
    boolean a=name.equals("amir");
    if (name != null && a==false) {
        throw new ExeptionName("(نام مطابقت ندار!!)");
    }}
    public void username(String username) throws ExeptionName {
        boolean b=username.equals("amir_abbasi");
        if (name != null && b==false) {
            throw new ExeptionName("(نام کاربری مطابقت ندار!!)");
        }}
        public void password(String password) throws ExeptionName {
            boolean c=password.equals("amir0023");
            if (name != null && c==false) {
                throw new ExeptionName("(پسورد مطابقت ندار!!)");
            }}
}

