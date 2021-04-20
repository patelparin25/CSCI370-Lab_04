package com.example.asynctask;

import java.util.ArrayList;

public class StudentDao {
    private ArrayList<Student> students = new ArrayList<Student>();
    public StudentDao() {
        students.add(new Student("Shane", "NotShane", "CSCI"));
        students.add(new Student("Matty", "NotMatty", "DS"));
        students.add(new Student("Krima", "NotKrima", "CETA"));
        students.add(new Student("Ashton", "NotAshton", "Math"));
        students.add(new Student("Colby", "NotColby", "Communication"));
    }

    public ArrayList<Student> getAllStudents() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return students;
    }
}

