package com.Heather;

public class ITECCourseManager {

    public static void main(String args[]) {
        ITECCourse maintenanceCourse =
            new ITECCourse("Microcomputer Systems Maintenance", 1310, "T3020", 20);
        //Add some students
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        maintenanceCourse.removeStudent("Carl");

        maintenanceCourse.writeCourseInfo();


        ITECCourse datacomCourse =
            new ITECCourse("Data Communications", 1425, "T3021", 30);
        //Add some students
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        datacomCourse.writeCourseInfo();

        //Test the add students method with a sample class//This class has a max of 3 students
        ITECCourse smallCourse = new ITECCourse("Small Course", 1111, "T3022", 3);
        smallCourse.addStudent("Jake");
        smallCourse.addStudent("Kirby");
        smallCourse.addStudent("Liam");
        //We can't add this student – what happens?
        smallCourse.addStudent("Marigold");
    }
}

