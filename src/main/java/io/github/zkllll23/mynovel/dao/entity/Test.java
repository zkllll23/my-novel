package io.github.zkllll23.mynovel.dao.entity;

import java.io.Serial;
import java.io.Serializable;

/**
 * 实体类
 *
 * @author zkllll23
 * @date 2023-05-24
 */
public class Test implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Byte test;

    private Byte test2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getTest() {
        return test;
    }

    public void setTest(Byte test) {
        this.test = test;
    }

    public Byte getTest2() {
        return test2;
    }

    public void setTest2(Byte test2) {
        this.test2 = test2;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", test=" + test +
                ", test2=" + test2 +
                "}";
    }
}