package com.lld.Behavioral.Template.Example1;

class CSVExporter extends DataExporter {
    protected void readData() {
        System.out.println("Reading data from CSV file");
    }

    protected void transformData() {
        System.out.println("Transforming CSV data");
    }

    protected void writeData() {
        System.out.println("Writing data to output stream");
    }
}
