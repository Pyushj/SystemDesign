package com.learning.lld.chainofresponsibility;

public class FatalLogHandler extends LogHandler {

    public FatalLogHandler(LogHandler nextLogHandler) {
        super(LogLevel.FATAL, nextLogHandler);
    }
}
