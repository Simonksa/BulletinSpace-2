/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bulletinspace.bulletindao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author ismail
 */
@Component
public class Test {
    public Student student;
    
    public void Display(){
        
    }
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
				"DAOSpring-Module.xml");
        Test helloWorld = (Test)context.getBean("test");
        Student student = (Student)context.getBean("student");
        
        System.out.println(student.getLast_name());
    }
    
}
