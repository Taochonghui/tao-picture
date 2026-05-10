package com.tch.model.enums;

import cn.hutool.core.util.ObjUtil;
import lombok.Getter;

/**
 * @author 陶崇慧
 * @version 1.0
 */

/**
 * 图片审核枚举
 */
@Getter
public enum PictureReviewEnum {
    REVIEWING("待审核", 0),
    PASS("通过", 1),
    REJECT("拒绝", 2);

    private final String text;
    private final int value;

    PictureReviewEnum(String text, int value) {
        this.text = text;
        this.value = value;
    }

    /**
     * 根据 value 获取枚举
     *
     * @param value
     * @return
     */
    public static PictureReviewEnum getEnumByValue(Integer value) {
        if (ObjUtil.isEmpty(value)) {
            return null;
        }
        for (PictureReviewEnum pictureReviewEnum : PictureReviewEnum.values()) {
            if (pictureReviewEnum.value == value) {
                return pictureReviewEnum;
            }
        }
        return null;
    }
}
