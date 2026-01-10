package com.learning.lld.chainofresponsibility;

public class InfoLogHandler extends LogHandler {
    public InfoLogHandler(LogHandler nextLoghandler) {
        super(LogLevel.INFO, nextLoghandler);
    }
}
