package com.company;

public class BuildPerson {
    private String id;
    private String name;
    private String password;
    private int age;
    private String homeAddres;
    private String phonenumber;
    private String edu;

    public BuildPerson (String id,String name,String password,int age,String homeAddres,String phonenumber,String edu){
        this.id=id;
        this.name=name;
        this.age=age;
        this.password=password;
        this.homeAddres=homeAddres;
        this.phonenumber=phonenumber;
        this.edu=edu;
    }
    public BuildPerson(){}

    public String getId(){
        return id;
    }
    public BuildPerson setId (String id){
        this.id=id;
        return this;
    }
    public String getName(){
        return name;
    }
    public BuildPerson setName (String name){
        this.name=name;
        return this;
    }
    public String getPassword(){
        return password;
    }
    public BuildPerson setPassword (String password){
        this.password=password;
        return this;
    }
    public String getHomeAddres(){
        return homeAddres;
    }
    public BuildPerson setHomeAddres (String homeAddres){
        this.homeAddres=homeAddres;
        return this;
    }
    public String getPhonenumber(){
        return phonenumber;
    }
    public BuildPerson setPhonenumber (String phonenumber){
        this.phonenumber=phonenumber;
        return this;
    }
    public int getAge(){
        return age;
    }
    public BuildPerson setAge (int age){
        this.age=age;
        return this;
    }
    public String getEdu(){
        return edu;
    }
    public BuildPerson setEdu (String edu){
        this.edu=edu;
        return this;
    }
}
