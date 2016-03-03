package com.Heather;

import java.util.ArrayList;

public class ITECCourseManager {

    public static void main(String args[]) {
        ArrayList<ITECCourse>allcourses=new ArrayList<>();
        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310, "T3020", 20);
        //Add some students
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        maintenanceCourse.removeStudent("Carl");

        allcourses.add(maintenanceCourse);
        maintenanceCourse.writeCourseInfo();


        ITECCourse datacomCourse =
            new ITECCourse("Data Communications", 1425, "T3021", 30);
        //Add some students
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        allcourses.add(datacomCourse);
        datacomCourse.writeCourseInfo();

        //Test the add students method with a sample class//This class has a max of 3 students
        ITECCourse smallCourse = new ITECCourse("Small Course", 1111, "T3022", 3);
        System.out.println("This course is called "+smallCourse.getCourseName());
        smallCourse.addStudent("Jake");
        smallCourse.addStudent("Kirby");
        smallCourse.addStudent("Liam");
        //We can't add this student – what happens?
        smallCourse.addStudent("Marigold");
        smallCourse.setCourseName("Very Small Course");

        allcourses.add(smallCourse);
        smallCourse.writeCourseInfo();


        //Another course
        ITECCourse infoCourse=new ITECCourse("Info Tech Concepts", 1100, "T3050", 30);
        infoCourse.addStudent("Max");
        infoCourse.addStudent("Nancy");
        infoCourse.addStudent("Orson");
        System.out.println("The room number for this course is usually "+infoCourse.getRoom());
        infoCourse.setRoom("T3010");
        System.out.println("The room number for "+infoCourse.getCourseName()+" has been changed to "+infoCourse.getRoom()+".\n");

        allcourses.add(infoCourse);
        infoCourse.writeCourseInfo();
    }
}

