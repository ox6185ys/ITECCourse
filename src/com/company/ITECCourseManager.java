package com.company;

public class ITECCourseManager {


    public static void main(String[] args) {
        ITECCourse maintenanceCourse =
        new ITECCourseManager("Microcomputer Systems Maintenance", 1310,20);

        maintenanceCourse.addStudent("Gus");
        maintenanceCourse.addStudent("Harry");
        maintenanceCourse.addStudent("Izzy");

        maintenanceCourse.writeCourseInfo();

        ITECCourse datacomCourse = new ITECCourse("Data Communications", 1425, 30);

        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        maintenanceCourse.writeCourseInfo();












    }
}
