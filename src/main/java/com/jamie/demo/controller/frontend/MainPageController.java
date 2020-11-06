package com.jamie.demo.controller.frontend;

import com.jamie.demo.entity.dto.MainPageInfoDTO;
import com.jamie.demo.entity.dto.Result;
import com.jamie.demo.service.combine.HeadLineShopCategoryCombineService;
import com.jamie.simpleframework.core.annotation.Controller;
import com.jamie.simpleframework.inject.annotation.Autowired;
import lombok.Getter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 测试controller
 * @author jamie
 * @date 20.11.6 15:25
 */
@Controller
@Getter
public class MainPageController {

    @Autowired(value = "HeadLineShopCategoryCombineServiceImpl")
    private HeadLineShopCategoryCombineService headLineShopCategoryCombineService;

    public Result<MainPageInfoDTO> getMainPageInfo(HttpServletRequest req, HttpServletResponse resp) {
        return headLineShopCategoryCombineService.getMainPageInfo();
    }

}
