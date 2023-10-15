package com.product.api.model;

public class Result<T> {
    private String resultCode;
    private String resultDesc;
    private T data;

    public Result() {
    }

    public Result(String resultCode, String resultDesc, T data) {
        this.resultCode = resultCode;
        this.resultDesc = resultDesc;
        this.data = data;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "resultCode='" + resultCode + '\'' +
                ", resultDesc='" + resultDesc + '\'' +
                ", data=" + data +
                '}';
    }
}
