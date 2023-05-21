package io.github.zkllll23.mynovel.core.common.exception;

import io.github.zkllll23.mynovel.core.common.constant.ErrorCodeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 自定义业务异常
 * 在处理用户请求、业务错误时抛出
 *
 * @author zkllll23
 * @date 2023/5/21
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessException extends RuntimeException {

    private final ErrorCodeEnum errorCode;

    public BusinessException(ErrorCodeEnum errorCode) {
        super(errorCode.getMessage(), null, false, false);
        this.errorCode = errorCode;
    }
}
