package com.jamie.demo.controller.frontend;

import com.jamie.demo.entity.dto.MainPageInfoDTO;
import com.jamie.demo.entity.dto.Result;
import com.jamie.demo.service.combine.HeadLineShopCategoryCombineService;
import com.jamie.simpleframework.core.annotation.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MainPageController {

    private HeadLineShopCategoryCombineService headLineShopCategoryCombineService;

    public Result<MainPageInfoDTO> getMainPageInfo(HttpServletRequest req, HttpServletResponse resp) {
        return headLineShopCategoryCombineService.getMainPageInfo();
    }

}
