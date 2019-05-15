package com.userFront;

public class ApiException extends BaseRuntimeException {

    private static final long serialVersionUID = 1L;
   // private com.userFront.ErrorType errorType;
    private ErrorType errorType;

    /*public ApiException( errorStatus) {
        super(errorStatus.getMessage());
        this.errorType = errorStatus;
    }*/

    public ApiException(ErrorType errorStatus){
        super(errorStatus.getMessage());
        this.errorType =errorStatus;
    }

    @Override
    public Integer getCode() {
        return this.errorType.getCode();
    }
}
