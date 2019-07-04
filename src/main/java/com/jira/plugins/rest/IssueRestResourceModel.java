package com.jira.plugins.rest;

import java.io.Serializable;

public class IssueRestResourceModel implements Serializable{

    public String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "IssueRestResourceModel{" +
                "message='" + message + '\'' +
                '}';
    }
}