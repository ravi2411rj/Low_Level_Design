package com.lld.Creational.Prototype_Registry.Example1;

public class Main {
    public static void main(String[] args) {
        // 1. Create the prototype Student object
        Student student1 = new Student();
        student1.setId(101);
        student1.setName("Alice");
        student1.setContactDetails("alice@example.com");
        student1.setPsp(85.5);
        student1.setBatchName("Java FSD 2025");
        student1.setBatchId(1);
        student1.setInstructorName("John Doe");
        student1.setModule("Backend Development");
        student1.setSchedule("Mon-Fri 9 AM - 5 PM");
        student1.setBatchPsp(80.0);
        student1.setBatchAttendance(92.0);

        // 2. Clone the prototype to create new Student objects
        Student student2 = student1.clone();
        student2.setId(102); // Change specific attributes for the new student
        student2.setName("Bob");
        student2.setContactDetails("bob@example.com");

        Student student3 = student1.clone();
        student3.setId(103);
        student3.setName("Charlie");
        student3.setContactDetails("charlie@example.com");
        student3.setPsp(90.1); // Charlie has a different PSP

        // 3. Add students to registry
        Registry<Student> registry = new Registry<>();
        registry.add("Student 1", student1);
        registry.add("Student 2", student2);
        registry.add("Student 3", student3);
    }
}