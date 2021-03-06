package com.jamie.demo.service.solo.impl;

import com.jamie.demo.entity.bo.HeadLine;
import com.jamie.demo.entity.dto.Result;
import com.jamie.demo.service.solo.HeadLineService;
import com.jamie.simpleframework.core.annotation.Service;
import com.jamie.simpleframework.inject.annotation.Autowired;

import java.util.List;

@Service
public class HeadLineServiceImpl implements HeadLineService {

    public static final String PATH = "/super-admin/head-line-operation";

    @Autowired
    private HeadLineService headLineService;

    @Override
    public Result<Boolean> addHeadLine(HeadLine headLine) {
        return null;
    }

    @Override
    public Result<Boolean> removeHeadLine(int headLineId) {
        return null;
    }

    @Override
    public Result<Boolean> modifyHeadLine(HeadLine headLine) {
        return null;
    }

    @Override
    public Result<HeadLine> queryHeadLineById(int headLineId) {
        return null;
    }

    @Override
    public Result<List<HeadLine>> queryHeadLine(HeadLine headLine, int pageIndex, int pageSize) {
        return null;
    }

}
