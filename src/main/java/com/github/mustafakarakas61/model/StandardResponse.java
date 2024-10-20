package com.github.mustafakarakas61.model;

public class StandardResponse<T> {
    private final String message;
    private T data;
    private final boolean success;

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