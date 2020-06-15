package com.example.evandro.banco.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Return implements Serializable {
    @SerializedName("success")
    private Boolean success;
    @SerializedName("message")
    private String message;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
