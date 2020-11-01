package com.jamie.demo.service.solo;

import com.jamie.demo.entity.bo.ShopCategory;
import com.jamie.demo.entity.dto.Result;

import java.util.List;

/**
 * ShopCategoryService
 * @author jamie
 * @date 20.10.29 14:20
 */
public interface ShopCategoryService {

    /**
     * 新增
     * @param shopCategory
     * @return com.jamie.demo.entity.dto.Result<java.lang.Boolean>
     */
    Result<Boolean> addShopCategory(ShopCategory shopCategory);
    /**
     * 删除
     * @param shopCategoryId
     * @return com.jamie.demo.entity.dto.Result<java.lang.Boolean>
     */
    Result<Boolean> removeShopCategory(int shopCategoryId);
    /**
     * 修改
     * @param shopCategoryId
     * @return com.jamie.demo.entity.dto.Result<java.lang.Boolean>
     */
    Result<Boolean> modifyShopCategory(ShopCategory shopCategoryId);
    /**
     * 查询
     * @param headLineId
     * @return com.jamie.demo.entity.dto.Result<com.jamie.demo.entity.bo.ShopCategory>
     */
    Result<ShopCategory> queryShopCategoryById(int headLineId);
    /**
     * 查询
     * @param shopCategoryCondition
     * @param pageIndex
     * @param pageSize
     * @return com.jamie.demo.entity.dto.Result<java.util.List < com.jamie.demo.entity.bo.ShopCategory>>
     */
    Result<List<ShopCategory>> queryShopCategory(ShopCategory shopCategoryCondition, int pageIndex, int pageSize);

}
