package com.jamie.demo.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {

    /** 本地请求结构的状态码，200表示成功 */
    private int code;

    /** 本次请求结果的详情 */
    private String message;

    /** 本次请求返回的结果集 */
    private T data;

}
