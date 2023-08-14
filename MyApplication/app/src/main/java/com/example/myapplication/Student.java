package com.example.myapplication;
import java.io.Serializable;
public class Student implements Serializable {
    private String name;
private int age;
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){return this.name;};
    public int getAge(){return this.age;};
}