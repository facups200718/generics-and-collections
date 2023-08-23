package com.logs;

public interface AccountLogs {
    default String getLogs() {
        return "Log captured";
    }
}
