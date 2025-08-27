package com.lld.Behavioral.ChainOfResponsibility.Example1;

public class Main {
    public static void main(String[] args) {
        Logger errorLogger = new ErrorLogger();
        Logger debugLogger = new DebugLogger();
        Logger infoLogger = new InfoLogger();

        infoLogger.setNext(debugLogger);
        debugLogger.setNext(errorLogger);

        infoLogger.log("System started", LogLevel.INFO);
        infoLogger.log("Debugging mode enabled", LogLevel.DEBUG);
        infoLogger.log("Null pointer exception", LogLevel.ERROR);
    }
}
