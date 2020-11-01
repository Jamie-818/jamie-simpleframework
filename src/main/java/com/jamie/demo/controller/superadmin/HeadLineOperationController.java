package com.jamie.demo.controller.superadmin;

import com.jamie.demo.entity.bo.HeadLine;
import com.jamie.demo.entity.dto.Result;
import com.jamie.demo.service.solo.HeadLineService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class HeadLineOperationController {

    private HeadLineService headLineService;

    public void addHeadLine(String lineName, String lineLink, String lineImg, Integer priority) {
//        HeadLine headLine = new HeadLine();
        //        headLine.setLineName(lineName);
        //        headLine.setLineLink(lineLink);
        //        headLine.setLineImg(lineImg);
        //        headLine.setPriority(priority);
        //        Result<Boolean> result = headLineService.addHeadLine(headLine);
        //        ModelAndView modelAndView = new ModelAndView();
        //        modelAndView.setView("addheadline.jsp").addViewData("result", result);
        //        return modelAndView;
    }

    public void removeHeadLine() {
        System.out.println("删除HeadLine");
    }

    public Result<Boolean> modifyHeadLine(HttpServletRequest req, HttpServletResponse resp) {
        //TODO:参数校验以及请求参数转化
        return headLineService.modifyHeadLine(new HeadLine());
    }

    public Result<HeadLine> queryHeadLineById(HttpServletRequest req, HttpServletResponse resp) {
        //TODO:参数校验以及请求参数转化
        return headLineService.queryHeadLineById(1);
    }

    public Result<List<HeadLine>> queryHeadLine() {
        return headLineService.queryHeadLine(null, 1, 100);
    }

}
