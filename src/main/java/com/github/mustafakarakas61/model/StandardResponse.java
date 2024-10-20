package com.github.mustafakarakas61.model;

public class StandardResponse<T> {
    private String message;
    private T data;
    private boolean success;

    public StandardResponse() {
    }

    public StandardResponse(String message, T data, boolean success) {
        this.message = message;
        this.data = data;
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public boolean isSuccess() {
        return success;
    }
}