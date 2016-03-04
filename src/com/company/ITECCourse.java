package com.company;

import java.util.ArrayList;

/**
 * Created by ox6185ys on 3/3/2016.
 */
public class ITECCourse {
    private String name;
    private int code;
    private ArrayList <String> students;
    private int maxStudents;

    public ITECCourse(String courseName, int courseCode, int courseMaxStudents) {
        this.name = courseName;
        this.name = courseCode;
        this.students = new ArrayList<>();
        this.maxStudents = courseMaxStudents;
    }
    public void removeStudent(StudentName){
        if (students.contains(studentName)){
            students.remove(studentName + ' was added to ' + this.name);
            System.out.println(studentName + "was removed from" + this.name);


        }
    }
}
