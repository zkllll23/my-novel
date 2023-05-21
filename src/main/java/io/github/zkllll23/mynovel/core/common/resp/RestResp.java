package io.github.zkllll23.mynovel.core.common.resp;

import io.github.zkllll23.mynovel.core.common.constant.ErrorCodeEnum;
import lombok.Getter;

/**
 * REST响应数据格式封装
 *
 * @author zkllll23
 * @date 2023/5/21
 */
@Getter
public class RestResp<T> {
    /**
     * 响应码
     */
    private String code;

    /**
     * 响应信息
     */
    private String message;

    /**
     * 响应数据
     */
    private T data;

    private RestResp() {
        this.code = ErrorCodeEnum.SUCCESS.getCode();
        this.message = ErrorCodeEnum.SUCCESS.getMessage();
    }

    private RestResp(ErrorCodeEnum errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }

    private RestResp(T data) {
        this.data = data;
    }

    /**
     * 业务处理成功，无响应数据
     */
    public static RestResp<Void> success() {
        return new RestResp<>();
    }

    /**
     * 业务处理成功，返回响应数据
     */
    public static <T> RestResp<T> success(T data) {
        return new RestResp<>(data);
    }

    /**
     * 业务处理失败
     */
    public static RestResp<Void> fail(ErrorCodeEnum errorCode) {
        return new RestResp<>(errorCode);
    }

    /**
     * 系统错误
     */
    public static RestResp<Void> error() {
        return new RestResp<>(ErrorCodeEnum.SYSTEM_ERROR);
    }
}
