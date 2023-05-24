package io.github.zkllll23.mynovel.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 稿费收入统计 实体类
 *
 * @author zkllll23
 * @date 2023-05-24
 */
@TableName("author_income")
public class AuthorIncome implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 作家ID
     */
    private Long authorId;

    /**
     * 小说ID
     */
    private Long bookId;

    /**
     * 收入月份
     */
    private LocalDate incomeMonth;

    /**
     * 税前收入;单位：分
     */
    private Integer preTaxIncome;

    /**
     * 税后收入;单位：分
     */
    private Integer afterTaxIncome;

    /**
     * 支付状态;0-待支付 1-已支付
     */
    private Byte payStatus;

    /**
     * 稿费确认状态;0-待确认 1-已确认
     */
    private Byte confirmStatus;

    /**
     * 详情
     */
    private String detail;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public LocalDate getIncomeMonth() {
        return incomeMonth;
    }

    public void setIncomeMonth(LocalDate incomeMonth) {
        this.incomeMonth = incomeMonth;
    }

    public Integer getPreTaxIncome() {
        return preTaxIncome;
    }

    public void setPreTaxIncome(Integer preTaxIncome) {
        this.preTaxIncome = preTaxIncome;
    }

    public Integer getAfterTaxIncome() {
        return afterTaxIncome;
    }

    public void setAfterTaxIncome(Integer afterTaxIncome) {
        this.afterTaxIncome = afterTaxIncome;
    }

    public Byte getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Byte payStatus) {
        this.payStatus = payStatus;
    }

    public Byte getConfirmStatus() {
        return confirmStatus;
    }

    public void setConfirmStatus(Byte confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "AuthorIncome{" +
                "id=" + id +
                ", authorId=" + authorId +
                ", bookId=" + bookId +
                ", incomeMonth=" + incomeMonth +
                ", preTaxIncome=" + preTaxIncome +
                ", afterTaxIncome=" + afterTaxIncome +
                ", payStatus=" + payStatus +
                ", confirmStatus=" + confirmStatus +
                ", detail=" + detail +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                "}";
    }
}