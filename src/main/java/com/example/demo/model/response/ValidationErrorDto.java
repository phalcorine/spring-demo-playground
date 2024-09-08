package com.example.demo.model.response;

public class ValidationErrorDto {
    private String field;
    private String message;

    public ValidationErrorDto(String field, String message) {
        this.field = field;
        this.message = message;
    }
    
    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }   
}
