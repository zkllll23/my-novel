package io.github.zkllll23.mynovel.core.common.req;

import lombok.Data;

/**
 * 分页请求数据格式封装
 *
 * @author zkllll23
 * @date 2023/5/21
 */

@Data
public class PageReqDto {
    /**
     * 请求页码，默认第1页
     */
    private int pageNum = 1;

    /**
     * 请求分页大小，默认每页10条
     */
    private int pageSize = 10;

    /**
     * 是否查询所有数据，默认否
     * 为true时，pageNum和pageSize无效
     */
    private boolean fetchAll = false;
}
