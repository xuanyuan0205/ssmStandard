package com.ym.ssm.pojoex;

import java.util.List;

/**
 * @ClassName: PageInfo
 * @Description: 分页封装
 * @auther: ym
 * @Date: 2019-4-18 15:51
 */
public class PageInfo<T> {
    public List<T> data;
    public Integer total;
}
