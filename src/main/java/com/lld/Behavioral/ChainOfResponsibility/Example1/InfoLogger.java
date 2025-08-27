package com.lld.Behavioral.ChainOfResponsibility.Example1;

class InfoLogger extends Logger {
    protected boolean canHandle(LogLevel level) {
        return level == LogLevel.INFO;
    }

    protected void write(String message) {
        System.out.println("INFO: " + message);
    }
}