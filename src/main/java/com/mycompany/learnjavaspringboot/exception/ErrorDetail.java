package com.mycompany.learnjavaspringboot.exception;

import java.time.LocalDateTime;

public class ErrorDetail {
    private LocalDateTime timestamp;
    private String message;
    private String description;

    public ErrorDetail(LocalDateTime timestamp, String message, String description) {
        this.timestamp = timestamp;
        this.message = message;
        this.description = description;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }

}
