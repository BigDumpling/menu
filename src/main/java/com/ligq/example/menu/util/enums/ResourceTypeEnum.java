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
 * @date 2018/1/23, 13:44
 */
public enum ResourceTypeEnum {
    MENU("MENU", "菜单，一级目录"),
    UI("UI", "页面，二级目录"),
    ACTION("ACTION", "动作，页面上的按钮");

    private String type;
    private String message;

    ResourceTypeEnum(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public static ResourceTypeEnum getValueByType(String type) {
        return Arrays.stream(ResourceTypeEnum.values()).filter(f -> f.getType().equals(type)).findFirst().orElse(null);
    }
}
