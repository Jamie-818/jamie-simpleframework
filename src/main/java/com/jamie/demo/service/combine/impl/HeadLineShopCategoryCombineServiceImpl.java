package com.jamie.demo.service.combine.impl;

import com.jamie.demo.entity.dto.MainPageInfoDTO;
import com.jamie.demo.entity.dto.Result;
import com.jamie.demo.service.combine.HeadLineShopCategoryCombineService;
import com.jamie.demo.service.solo.HeadLineService;
import com.jamie.demo.service.solo.ShopCategoryService;

public class HeadLineShopCategoryCombineServiceImpl implements HeadLineShopCategoryCombineService {

    private HeadLineService headLineService;

    private ShopCategoryService shopCategoryService;

    @Override
    public Result<MainPageInfoDTO> getMainPageInfo() {
        //        // 1.获取头像信息
        //        HeadLine headLine = HeadLine.builder().enableStatus(1).build();
        //        Result<List<HeadLine>> queryHeadLine = headLineService.queryHeadLine(headLine, 1, 4);
        //        ShopCategory shopCategory = ShopCategory.builder().build();
        //        // 2.获取店铺类别列表
        //        Result<List<ShopCategory>> queryShopCategory = shopCategoryService.queryShopCategory(shopCategory,
        //       1, 100);
        //        // 3.合并两者并返回
        //        MainPageInfoDTO mainPageInfoDTO = new MainPageInfoDTO();
        //        mainPageInfoDTO.setHeadLineList(queryHeadLine.getData());
        //        mainPageInfoDTO.setShopCategoryList(queryShopCategory.getData());
        //
        //        return Result.<MainPageInfoDTO>builder().code(200).data(mainPageInfoDTO).build();
        return null;
    }

}
