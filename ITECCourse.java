package com.Heather;
import java.util.*;
/**
 * Created by cryst on 3/2/2016.
 */
public class ITECCourse {
    //Data for an ITECCourse object to store
    private String name;
    private int code;
    private String room;
    private ArrayList<String> students;
    private int maxStudents;



    //Constructor
    ITECCourse(String courseName, int courseCode, String courseRoom, int courseMaxStudents) {
        this.name = courseName;
        this.code = courseCode;
        this.room = courseRoom;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
    }

    void addStudent(String studentName) {
        //if the number of students is the same as the max allowed, can't add any more.
        if (students.size()<this.maxStudents){
            students.add(studentName);
            System.out.println(studentName+" was added to "+this.name);
        }else {
            //there is no room for this student
            System.out.println(this.name+" is full, max number of students is "+this.maxStudents+".  "+studentName+" was not added.\n");
        }
    }
    void removeStudent(String studentName){
        if (students.contains(studentName)){
            students.remove(studentName);
            System.out.println(studentName+" was un-enrolled from "+this.name);
        }else {
            System.out.println(studentName+" was not found in this course.");
        }
    }
    public String getCourseName(){
        return this.name;
    }

    public void setCourseName(String newName){
        this.name=newName;
    }

    public String getRoom(){
        return this.room;
    }

    public void setRoom(String newRoom){
        this.room=newRoom;
    }

    public int getNumberOfStudents() {
        return this.students.size();
    }

    public void writeCourseInfo() {
        System.out.println("\nCourse Name: " + this.name);
        System.out.println("Course Code: " + this.code);
        System.out.println("Room Number: " + this.room);
        System.out.println("Students enrolled:");
        for (String student : this.students) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled.");
        System.out.println("The max number of students that can enroll in this course is " + this.maxStudents+".\n");
    }
}



