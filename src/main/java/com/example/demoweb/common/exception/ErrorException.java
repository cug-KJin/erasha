package com.example.demoweb.common.exception;

public class ErrorException extends Exception {
    String errorCode;
    String errorMsg;

    public ErrorException(String errorCode,String errorMsg){
        super(errorMsg);
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
