package com.oops;


public class Main {

    public static void main(String[] args) {

        Student shashi = new Student(10, "Shashikant", 89.5f);
        System.out.println(shashi.rollNo);
        System.out.println(shashi.name);
        System.out.println(shashi.marks);

        Student ahiransh = new Student(67 , "Ahiransh" , 45.6f,306151);
        System.out.println(ahiransh.rollNo);
        System.out.println(ahiransh.name);
        System.out.println(ahiransh.marks);
        System.out.println(ahiransh.phone);

    }
}

class Student{
    int rollNo;
    String name;
    float marks;

    long phone;

    Student(int rol , String naaam , float mark){
        this.rollNo= rol;
        this.name = naaam;
        this.marks = mark;

    }
    Student(int rollNo , String name , float marks, long phone){
        this.rollNo= rollNo;
        this.name = name;
        this.marks = marks;
        this.phone = phone;

    }
}




