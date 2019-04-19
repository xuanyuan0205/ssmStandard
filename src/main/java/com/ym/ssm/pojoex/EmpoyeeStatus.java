package com.ym.ssm.pojoex;

public enum EmpoyeeStatus {
    LOGIN(100,"用户登录"),
    LOGOUT(200,"用户登出"),
    FORBIDDEN(200,"用户禁用");

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private Integer code;
    private String msg;
    private EmpoyeeStatus(Integer code,String msg){
        this.code=code;
        this.msg=msg;
    }

    public static EmpoyeeStatus getStatusByCode(Integer code){
        switch (code){
            case 100:
                return EmpoyeeStatus.LOGIN;
            case 200:
                return EmpoyeeStatus.LOGOUT;
            case 300:
                return EmpoyeeStatus.FORBIDDEN;
                default:
                    return EmpoyeeStatus.LOGOUT;
        }
    }
}
