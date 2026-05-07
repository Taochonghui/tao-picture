package com.tch.model.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author 陶崇慧
 * @version 1.0
 */

/**
 * 图片标签分类列表视图
 */
@Data
public class PictureTagCategory implements Serializable {

    private static final long serialVersionUID = 4083317213012682379L;

    /**
     * 标签列表
     */
    private List<String> tagList;

    /**
     * 分类列表
     */
    private List<String> categoryList;
}
