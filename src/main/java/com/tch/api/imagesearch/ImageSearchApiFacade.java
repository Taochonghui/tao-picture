package com.tch.api.imagesearch;

/**
 * @author 陶崇慧
 * @version 1.0
 */

import com.tch.api.imagesearch.model.ImageSearchResult;
import com.tch.api.imagesearch.sub.GetImageFirstUrlApi;
import com.tch.api.imagesearch.sub.GetImageListApi;
import com.tch.api.imagesearch.sub.GetImagePageUrlApi;

import java.util.List;

/**
 * 图片搜索（门面模式）
 */
public class ImageSearchApiFacade {

    /**
     * 搜索图片
     *
     * @param imageUrl
     * @return
     */
    public static List<ImageSearchResult> searchImage(String imageUrl) {
        String imagePageUrl = GetImagePageUrlApi.getImagePageUrl(imageUrl);
        String imageFirstUrl = GetImageFirstUrlApi.getImageFirstUrl(imagePageUrl);
        List<ImageSearchResult> imageList = GetImageListApi.getImageList(imageFirstUrl);
        return imageList;
    }

    public static void main(String[] args) {
        // 测试以图搜图功能
        String imageUrl = "https://gips0.baidu.com/it/u=1690853528,2506870245&fm=3028&app=3028&f=JPEG&fmt=auto?w=1024&h=1024";
        List<ImageSearchResult> resultList = searchImage(imageUrl);
        System.out.println("结果列表" + resultList);
    }

}
