package io.github.zkllll23.mynovel.core.common.constant;

/**
 * 通用常量
 *
 * @author zkllll23
 * @date 2023/5/21
 */
public class CommonConsts {
    /**
     * 是
     */
    public static final Integer YES = 1;

    /**
     * 否
     */
    public static final Integer NO = 0;

    /**
     * 性别常量
     */
    public enum SexEnum {
        /**
         * 男
         */
        MALE(0, "男"),

        /**
         * 女
         */
        FEMALE(1, "女");

        /**
         * 性别
         */
        private final int sex;

        /**
         * 描述
         */
        private final String desc;

        SexEnum(int sex, String desc) {
            this.sex = sex;
            this.desc = desc;
        }

        public int getCode() {
            return sex;
        }

        public String getDesc() {
            return desc;
        }
    }
}
