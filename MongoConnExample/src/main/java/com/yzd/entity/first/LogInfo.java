package com.yzd.entity.first;

import org.springframework.data.annotation.Id;

/**
 * Created by Administrator on 2016/11/14.
 */
public class LogInfo {
    @Id
    private String id;
    private String level;
    private String loggerName;
    private String message;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLoggerName() {
        return loggerName;
    }

    public void setLoggerName(String loggerName) {
        this.loggerName = loggerName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
