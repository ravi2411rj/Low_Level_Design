package com.lld.Behavioral.Template.Example1;

public abstract class DataExporter {
    // Template method
    public final void export() {
        readData();
        transformData();
        writeData();
    }

    protected abstract void readData();

    protected abstract void transformData();

    protected abstract void writeData();
}
