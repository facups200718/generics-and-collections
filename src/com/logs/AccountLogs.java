package com.logs;

public interface AccountLogs {
    default String getLogs() {
        return logMessage("Log captured");
    }

    private String logMessage(String message) {
        return message;
    }
}
