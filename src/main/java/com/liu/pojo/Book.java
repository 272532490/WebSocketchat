package com.liu.pojo;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable {
    private static final long serialVersionUID = 5971584383869177283L;
    private Integer id;//����id
    private String bookName;//����
    private String bookType;//������
    private String bookTitle;//�����
    private String bookContent;//������
    private Date updateTime;//�ϴ�ʱ��

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookContent() {
        return bookContent;
    }

    public void setBookContent(String bookContent) {
        this.bookContent = bookContent;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
