package com.study.common.entity;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author chenglutao
 * @date 2019-12-20 10:28
 */
public enum Key {
    OK("0000"),
    ERROR("9999"),;

    private final String code;

    Key(String code) {
        this.code = code;
    }

    @JsonValue
    public String getCode() {
        return code;
    }
}
