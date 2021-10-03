/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spark.java;

import java.util.ArrayList;

/**
 *
 * @author haamani
 */
public class Service {
    
 
    public Service() {
        
    }
    
    public ArrayList<Student> getStudentsRecord(){
        return Database.getStudents();
    } 
    
    public void createStudent(Student student){
       Database.createStudent(student);
    }
    
}
