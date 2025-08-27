package com.lld.Behavioral.Template.Example1;

class DatabaseExporter extends DataExporter {
    protected void readData() {
        System.out.println("Reading data from database");
    }

    protected void transformData() {
        System.out.println("Transforming database records");
    }

    protected void writeData() {
        System.out.println("Writing data to file");
    }
}
