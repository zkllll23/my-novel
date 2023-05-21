package io.github.zkllll23.mynovel.core.common.resp;

import lombok.Data;
import lombok.Getter;

import java.util.List;

/**
 * 分页响应数据格式封装
 *
 * @author zkllll23
 * @date 2023/5/21
 */
@Data
@Getter
public class PageRespDto<T> {

    /**
     * 页码
     */
    private final long pageNum;

    /**
     * 分页大小
     */
    private final long pageSize;

    /**
     * 总记录数
     */
    private final long total;

    /**
     * 分页数据集
     */
    private final List<? extends T> list;
}
