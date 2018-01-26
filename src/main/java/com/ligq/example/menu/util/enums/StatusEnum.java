/*
 * Copyright (c) 2018. EverBright Yunfu Internet CO.,LTD. All rights reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 *
 * Proprietary and confidential.
 */

package com.ligq.example.menu.util.enums;

import java.util.Arrays;

/**
 * class $classname
 *
 * @author ligq
 * @description
 * @date 2018/1/23, 13:39
 */
public enum StatusEnum {
    EFFECT(1, "生效"),
    UN_EFFECT(0, "失效");

    private Integer status;
    private String message;

    StatusEnum(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public static StatusEnum getValueByStatus(Integer status) {
        return Arrays.stream(StatusEnum.values()).filter(f -> f.getStatus().equals(status)).findFirst().orElse(null);
    }
}
