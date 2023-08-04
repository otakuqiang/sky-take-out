package com.sky.service;

import com.sky.dto.DishDTO;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Otaku
 * @Date: 2023/08/04/10:47
 * @Description:
 */


public interface DishService {
    /**
     * 新增菜品和对应的口味数据
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
