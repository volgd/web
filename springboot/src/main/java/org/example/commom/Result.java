package org.example.commom;

//统一返回包装类

public class Result {
    private String code;
    private String msg;
   private Object data;

    public static Result success(){
        Result result = new Result();
        result.code = "200";
        result.msg = "请求成功";
        return result;
    }

    public static Result success(Object data){
        Result result = success();
        result.setData(data);
        return result;
    }

    public static Result error(){
        Result result = new Result();
        result.code = "500";
        result.msg = "请求失败";
        return result;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
