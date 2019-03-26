package com.ttn.sling.project.core.services;

public class Student {

    int marks;
    String name;
    int id;
    int age;

    public Student(int marks, String name, int id, int age) {
        this.marks = marks;
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
