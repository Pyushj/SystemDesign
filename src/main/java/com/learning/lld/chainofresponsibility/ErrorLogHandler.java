package com.learning.lld.chainofresponsibility;

public class ErrorLogHandler extends LogHandler {
    public ErrorLogHandler(LogHandler nextLoghandler) {
        super(LogLevel.ERROR, nextLoghandler);
    }
}
