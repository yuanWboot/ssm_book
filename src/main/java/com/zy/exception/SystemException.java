package com.zy.exception;
//自定义异常器处理类，用于封装异常信息，对异常分类
public class SystemException extends RuntimeException{
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
    
    public SystemException(Integer code,String message){
        super(message);
        this.code = code;
    }
    
    public SystemException(Integer code,String message,Throwable cause){
        super(message,cause);
        this.code = code;
    }
}
