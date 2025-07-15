package com.lld.Creational.Prototype;

public class Main {
    public static void main(String[] args) {
        // 1. Create the prototype Student object
        Student studentPrototype = new Student();
        studentPrototype.setId(101);
        studentPrototype.setName("Alice");
        studentPrototype.setContactDetails("alice@example.com");
        studentPrototype.setPsp(85.5);
        studentPrototype.setBatchName("Java FSD 2025");
        studentPrototype.setBatchId(1);
        studentPrototype.setInstructorName("John Doe");
        studentPrototype.setModule("Backend Development");
        studentPrototype.setSchedule("Mon-Fri 9 AM - 5 PM");
        studentPrototype.setBatchPsp(80.0);
        studentPrototype.setBatchAttendance(92.0);

        // 2. Clone the prototype to create new Student objects
        Student student2 = studentPrototype.clone();
        student2.setId(102); // Change specific attributes for the new student
        student2.setName("Bob");
        student2.setContactDetails("bob@example.com");

        Student student3 = studentPrototype.clone();
        student3.setId(103);
        student3.setName("Charlie");
        student3.setContactDetails("charlie@example.com");
        student3.setPsp(90.1); // Charlie has a different PSP
    }
}