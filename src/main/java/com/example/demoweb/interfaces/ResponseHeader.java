package com.example.demoweb.interfaces;

public class ResponseHeader {

    /**
     * errorCode :
     * errorMgs :
     * responseDateTime :
     */

    private String errorCode;
    private String errorMgs;
    private String responseDateTime;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMgs() {
        return errorMgs;
    }

    public void setErrorMgs(String errorMgs) {
        this.errorMgs = errorMgs;
    }

    public String getResponseDateTime() {
        return responseDateTime;
    }

    public void setResponseDateTime(String responseDateTime) {
        this.responseDateTime = responseDateTime;
    }
}
