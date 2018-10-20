/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.javens.springboot.dubbo.api;

/**
 * @author chenhx
 * @version CommonErrorEnum.java, v 0.1 2018-09-03 上午 10:15
 */
public enum CommonErrorEnum {
    /**
     * 错误码枚举
     */
    SYS_ERROR("9999", "网络繁忙，请稍后再试"),
    NOT_SUPPORT_METHOD("9998", "不支持该HTTP METHOD"),
    API_NOT_EXIST("9997", "接口不存在"),
    INVALID_PARAM("9996", "接口参数不正确"),
    PERMISSION_DENIED("9995", "没有权限"),
    PARAM_VALIDATE_ERROR("9994", "参数验证失败"),
    SIGN_ERROR("9993", "签名验证失败"),
    NO_FIND_CURRENT_RUNTIME_ENV("9992", "未找到当前运行环境");

    private String code;
    private String msg;

    CommonErrorEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static CommonErrorEnum getByCode(String code) {
        CommonErrorEnum[] valueList = CommonErrorEnum.values();
        for (CommonErrorEnum v : valueList) {
            if (v.getCode().equals(code)) {
                return v;
            }
        }
        return null;
    }

    /**
     * Getter method for property <tt>code</tt>.
     *
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Getter method for property <tt>msg</tt>.
     *
     * @return property value of msg
     */
    public String getMsg() {
        return msg;
    }
}
