package com.myapp.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

public class student {
    @Length(max = 10)
    private String content;

    public student() {
        // Jackson deserialization
    }

    @JsonProperty
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public student(String content) {
        this.content = content;
    }

}
