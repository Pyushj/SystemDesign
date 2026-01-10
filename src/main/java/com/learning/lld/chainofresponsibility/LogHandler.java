package com.learning.lld.chainofresponsibility;

public abstract class LogHandler {
    private final LogLevel level;
    private final LogHandler nextLogHandler;

    public LogHandler(LogLevel logLevel, LogHandler nextLogHandler) {
        this.level = logLevel;
        this.nextLogHandler = nextLogHandler;
    }

    public void parseLog(LogLevel logLevel, String message) {
        if (level == logLevel) {
            logMessage(message);
        } else if (nextLogHandler != null) {
            nextLogHandler.parseLog(logLevel, message);
        }
    }

    private void logMessage(String message) {
        System.out.println("[" + level + "] " + message);
    }
}
