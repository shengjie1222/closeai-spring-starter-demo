package com.ethereal.closeai.test.service;

import cn.gjsm.api.pojo.image.Base64Image;
import com.ethereal.closeai.test.pojo.Image;

import java.util.List;

/**
 * @author Jie Jie
 * date 2023-08-17
 */
public interface IImageService {

    /**
     * 请求
     * @param image
     * @return
     */
    List<Base64Image> answer(Image image);
}
