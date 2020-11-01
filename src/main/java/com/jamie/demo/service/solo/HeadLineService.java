package com.jamie.demo.service.solo;

import com.jamie.demo.entity.bo.HeadLine;
import com.jamie.demo.entity.dto.Result;

import java.util.List;

/**
 * HeadLineService
 * @author jamie
 * @date 20.10.29 14:20
 */
public interface HeadLineService {

    /**
     * 新增
     * @param headLine
     * @return com.jamie.demo.entity.dto.Result<java.lang.Boolean>
     */
    Result<Boolean> addHeadLine(HeadLine headLine);
    /**
     * 删除
     * @param headLineId
     * @return com.jamie.demo.entity.dto.Result<java.lang.Boolean>
     */
    Result<Boolean> removeHeadLine(int headLineId);
    /**
     * 修改
     * @param headLine
     * @return com.jamie.demo.entity.dto.Result<java.lang.Boolean>
     */
    Result<Boolean> modifyHeadLine(HeadLine headLine);
    /**
     * 查询
     * @param headLineId
     * @return com.jamie.demo.entity.dto.Result<com.jamie.demo.entity.bo.HeadLine>
     */
    Result<HeadLine> queryHeadLineById(int headLineId);
    /**
     * 查询
     * @param headLineCondition
     * @return com.jamie.demo.entity.dto.Result<java.util.List < com.jamie.demo.entity.bo.HeadLine>>
     */
    Result<List<HeadLine>> queryHeadLine(HeadLine headLineCondition, int pageIndex, int pageSize);

}
