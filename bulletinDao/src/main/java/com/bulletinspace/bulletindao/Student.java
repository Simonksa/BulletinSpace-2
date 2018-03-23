/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bulletinspace.bulletindao;

/**
 *
 * @author ismail
 */
public class Student {
    private String name;
    private String last_name;
    
    private Address address;
    private Courses courses;
    
    //private int age;
    
//    public String getName() {
//        return name;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    
//    public Address getAddress() {
//        return address;
//    }

    public void setAddress(Address address) {
        this.address = address;
    }

//    public Courses getCourses() {
//        return courses;
//    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }
    

    

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
    
}
