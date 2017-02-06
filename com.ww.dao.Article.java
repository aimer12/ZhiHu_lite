package com.ww.dao;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by  on 2016/11/3.
 */

@Entity
@Table(name = "ARTICLE")
public class Article implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String context;



    @Column(nullable = false)
    private int jiang;

    @Column(nullable = false)
    private Date createTime;

    @Column(nullable = true)
    private Date updateTime;

    public Long getAuther() {
        return auther;
    }

    public void setAuther(Long auther) {
        this.auther = auther;
    }

    @Column(nullable = false)
    private Long auther;

    protected Article(){}

    public Article(String title, String context, int jiang, Date createTime, Long auther){
        this.auther = auther;
        this.title = title;
        this.context = context;
        this.jiang = jiang;
        this.createTime = createTime;
    }

    @Override
    public String toString(){
        return String.format("Article--id:%d, title:%s \n\t jiang:%d",
            id, title,jiang);
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getContext() {
//        return context;
//    }
//
//    public void setContext(String context) {
//        this.context = context;
//    }
//
//    public int getJiang() {
//        return jiang;
//    }
//
//    public void setJiang(int jiang) {
//        this.jiang = jiang;
//    }
//    public Date getUpdateTime() {
//        return updateTime;
//    }
//
//    public void setUpdateTime(Date updateTime) {
//        this.updateTime = updateTime;
//    }
//
//    public Date getCreateTime() {
//        return createTime;
//    }
//
//    public void setCreateTime(Date createTime) {
//        this.createTime = createTime;
//    }

}
