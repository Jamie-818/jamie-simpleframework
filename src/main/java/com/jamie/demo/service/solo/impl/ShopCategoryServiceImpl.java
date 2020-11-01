package com.jamie.demo.service.solo.impl;

import com.jamie.demo.entity.bo.ShopCategory;
import com.jamie.demo.entity.dto.Result;
import com.jamie.demo.service.solo.ShopCategoryService;

import java.util.List;

public class ShopCategoryServiceImpl implements ShopCategoryService {

    @Override
    public Result<Boolean> addShopCategory(ShopCategory shopCategory) {
        return null;
    }

    @Override
    public Result<Boolean> removeShopCategory(int shopCategoryId) {
        return null;
    }

    @Override
    public Result<Boolean> modifyShopCategory(ShopCategory shopCategoryId) {
        return null;
    }

    @Override
    public Result<ShopCategory> queryShopCategoryById(int headLineId) {
        return null;
    }

    @Override
    public Result<List<ShopCategory>> queryShopCategory(ShopCategory shopCategoryCondition, int pageIndex, int pageSize) {
        return null;
    }

}
