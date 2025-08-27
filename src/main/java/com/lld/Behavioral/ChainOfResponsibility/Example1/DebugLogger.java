package com.lld.Behavioral.ChainOfResponsibility.Example1;

class DebugLogger extends Logger {
    protected boolean canHandle(LogLevel level) {
        return level == LogLevel.DEBUG;
    }

    protected void write(String message) {
        System.out.println("DEBUG: " + message);
    }
}
