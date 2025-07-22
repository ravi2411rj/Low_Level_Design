package com.lld.Creational.Prototype_Registry.Example1;

public class Main {
    public static void main(String[] args) {
        // 1. Create the prototype Student object
        Student s1 = new Student();
        s1.setId(101);
        s1.setName("Alice");
        s1.setContactDetails("alice@example.com");
        s1.setPsp(85.5);
        s1.setBatchName("Java FSD 2025");
        s1.setBatchId(1);
        s1.setInstructorName("John Doe");
        s1.setModule("Backend Development");
        s1.setSchedule("Mon-Fri 9 AM - 5 PM");
        s1.setBatchPsp(80.0);
        s1.setBatchAttendance(92.0);

        // 2. Clone the prototype to create new Student objects
        Student s2 = s1.clone();
        s2.setId(102); // Change specific attributes for the new student
        s2.setName("Bob");
        s2.setContactDetails("bob@example.com");

        Student s3 = s1.clone();
        s3.setId(103);
        s3.setName("Charlie");
        s3.setContactDetails("charlie@example.com");
        s3.setPsp(90.1); // Charlie has a different PSP

        // 3. Add students to registry
        Registry<Student> registry = new Registry<>();
        registry.add("Student 1", s1);
        registry.add("Student 2", s2);
        registry.add("Student 3", s3);
    }
}