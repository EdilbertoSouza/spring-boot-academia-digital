package me.dio.academia.digital.exception;

public class BadRequestException extends RuntimeException {
    private static final long serialVersionUID = -6958128182491079251L;

    public BadRequestException() {
        super();
    }

    private String value;
    private String message;

    public BadRequestException(String value, String message) {
        this.value = value;
        this.message = message;
    }

    public String getValue() {
        return value;
    }

    public String getMessage() {
        return this.message;
    }

}