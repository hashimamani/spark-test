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
public class Database {

    static ArrayList<Student> studentList = new ArrayList<>();

    public static void createStudent(Student student) {
        studentList.add(student);
    }

    public static ArrayList<Student> getStudents() {
        return studentList;
    }
}
