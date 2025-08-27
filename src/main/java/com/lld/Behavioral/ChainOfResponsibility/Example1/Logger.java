package com.lld.Behavioral.ChainOfResponsibility.Example1;

public abstract class Logger {
    protected Logger next;

    public void setNext(Logger next) {
        this.next = next;
    }

    public void log(String message, LogLevel level) {
        if (canHandle(level)) {
            write(message);
        } else if (next != null) {
            next.log(message, level);
        }
    }

    protected abstract boolean canHandle(LogLevel level);

    protected abstract void write(String message);
}
