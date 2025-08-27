package com.lld.Behavioral.ChainOfResponsibility.Example1;

class ErrorLogger extends Logger {
    protected boolean canHandle(LogLevel level) {
        return level == LogLevel.ERROR;
    }

    protected void write(String message) {
        System.out.println("ERROR: " + message);
    }
}
