package org.example.repository;

import org.example.model.Log;

import java.util.ArrayList;
import java.util.List;

public class LogList {
    public static List<Log> logs = new ArrayList<>();


    public static List<Log> getLogs() {
        return logs;
    }
    public static void setLogs(List<Log> logs) {
        LogList.logs = logs;
    }
}
