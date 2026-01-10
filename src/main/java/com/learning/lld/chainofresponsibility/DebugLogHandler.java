package com.learning.lld.chainofresponsibility;

public class DebugLogHandler extends LogHandler {
    public DebugLogHandler(LogHandler nextLogHandler) {
        super(LogLevel.DEBUG, nextLogHandler);
    }
}
