package io.github.zkllll23.mynovel.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 小说信息 实体类
 *
 * @author zkllll23
 * @date 2023-05-24
 */
@TableName("book_info")
public class BookInfo implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 作品方向;0-男频 1-女频
     */
    private Byte workDirection;

    /**
     * 类别ID
     */
    private Long categoryId;

    /**
     * 类别名
     */
    private String categoryName;

    /**
     * 小说封面地址
     */
    private String picUrl;

    /**
     * 小说名
     */
    private String bookName;

    /**
     * 作家id
     */
    private Long authorId;

    /**
     * 作家名
     */
    private String authorName;

    /**
     * 书籍描述
     */
    private String bookDesc;

    /**
     * 评分;总分:10 ，真实评分 = score/10
     */
    private Byte score;

    /**
     * 书籍状态;0-连载中 1-已完结
     */
    private Byte bookStatus;

    /**
     * 点击量
     */
    private Long visitCount;

    /**
     * 总字数
     */
    private Integer wordCount;

    /**
     * 评论数
     */
    private Integer commentCount;

    /**
     * 最新章节ID
     */
    private Long lastChapterId;

    /**
     * 最新章节名
     */
    private String lastChapterName;

    /**
     * 最新章节更新时间
     */
    private LocalDateTime lastChapterUpdateTime;

    /**
     * 是否收费;1-收费 0-免费
     */
    private Byte isVip;

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

    public Byte getWorkDirection() {
        return workDirection;
    }

    public void setWorkDirection(Byte workDirection) {
        this.workDirection = workDirection;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookDesc() {
        return bookDesc;
    }

    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }

    public Byte getScore() {
        return score;
    }

    public void setScore(Byte score) {
        this.score = score;
    }

    public Byte getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(Byte bookStatus) {
        this.bookStatus = bookStatus;
    }

    public Long getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(Long visitCount) {
        this.visitCount = visitCount;
    }

    public Integer getWordCount() {
        return wordCount;
    }

    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Long getLastChapterId() {
        return lastChapterId;
    }

    public void setLastChapterId(Long lastChapterId) {
        this.lastChapterId = lastChapterId;
    }

    public String getLastChapterName() {
        return lastChapterName;
    }

    public void setLastChapterName(String lastChapterName) {
        this.lastChapterName = lastChapterName;
    }

    public LocalDateTime getLastChapterUpdateTime() {
        return lastChapterUpdateTime;
    }

    public void setLastChapterUpdateTime(LocalDateTime lastChapterUpdateTime) {
        this.lastChapterUpdateTime = lastChapterUpdateTime;
    }

    public Byte getIsVip() {
        return isVip;
    }

    public void setIsVip(Byte isVip) {
        this.isVip = isVip;
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
        return "BookInfo{" +
                "id=" + id +
                ", workDirection=" + workDirection +
                ", categoryId=" + categoryId +
                ", categoryName=" + categoryName +
                ", picUrl=" + picUrl +
                ", bookName=" + bookName +
                ", authorId=" + authorId +
                ", authorName=" + authorName +
                ", bookDesc=" + bookDesc +
                ", score=" + score +
                ", bookStatus=" + bookStatus +
                ", visitCount=" + visitCount +
                ", wordCount=" + wordCount +
                ", commentCount=" + commentCount +
                ", lastChapterId=" + lastChapterId +
                ", lastChapterName=" + lastChapterName +
                ", lastChapterUpdateTime=" + lastChapterUpdateTime +
                ", isVip=" + isVip +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                "}";
    }
}