package com.tch.model.dto.picture;

import lombok.Data;

import java.io.Serializable;

/**
 * 批量上传图片请求类
 */
@Data
public class PictureUploadByBatchRequest implements Serializable {

    private static final long serialVersionUID = 1165337836811853224L;

    /**
     * 搜索词
     */
    private String searchText;

    /**
     * 抓取数量
     */
    private Integer count = 10;

    /**
     * 名称前缀
     */
    private String namePrefix;

}
