package com.jamie.demo.entity.dto;

import com.jamie.demo.entity.bo.HeadLine;
import com.jamie.demo.entity.bo.ShopCategory;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MainPageInfoDTO {

    private List<HeadLine> headLineList;

    private List<ShopCategory> shopCategoryList;

}
