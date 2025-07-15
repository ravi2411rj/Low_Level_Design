package com.lld.Creational.Prototype;

import lombok.Setter;

@Setter
public class Student implements Prototype<Student> {

    private int id;
    private String name;
    private String contactDetails;
    private double psp;
    private String batchName;
    private int batchId;
    private String instructorName;
    private String module;
    private String schedule;
    private double batchPsp;
    private double batchAttendance;

    @Override
    public Student clone() {
        Student copy = new Student();

        copy.id = this.id;
        copy.name = this.name;
        copy.contactDetails = this.contactDetails;
        copy.psp = this.psp;
        copy.batchName = this.batchName;
        copy.batchId = this.batchId;
        copy.instructorName = this.instructorName;
        copy.module = this.module;
        copy.schedule = this.schedule;
        copy.batchPsp = this.batchPsp;
        copy.batchAttendance = this.batchAttendance;

        return copy;
    }
}
