package io.github.zkllll23.mynovel.core.common.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 响应错误码枚举类
 *
 * @author zkllll23
 * @date 2023/5/21
 */
@Getter
@AllArgsConstructor
public enum ErrorCodeEnum {

    /**
     * 业务执行成功
     */
    SUCCESS("1", "成功"),

    /**
     * 用户相关错误
     */
    USER_ERROR("A0001", "用户错误"),

    /**
     * 系统相关错误
     */
    SYSTEM_ERROR("B0001", "系统错误"),

    /**
     * 第三方服务相关错误
     */
    THIRD_SERVICE_ERROR("C0001", "第三方错误");

    /**
     * 响应码
     */
    private final String code;

    /**
     * 响应信息
     */
    private final String message;


}
