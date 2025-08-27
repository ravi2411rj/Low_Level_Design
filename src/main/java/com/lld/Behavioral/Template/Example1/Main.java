package com.lld.Behavioral.Template.Example1;

public class Main {
    public static void main(String[] args) {
        DataExporter exporter1 = new CSVExporter();
        exporter1.export();

        DataExporter exporter2 = new DatabaseExporter();
        exporter2.export();
    }
}
