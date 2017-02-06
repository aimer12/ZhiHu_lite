package com.ww.dao;

import javax.persistence.*;

/**
 * Created  on 2016/11/7.
 */

@Entity
@Table(name = "COMMENT")
public class Comment {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(nullable = false)
    private String comment;

    @Column(nullable = false)
    private Long auid;

    @Column(nullable = false)
    private Long arid;

    public Comment(String comment, Long auther_id, Long article_id){
        this.arid = article_id;
        this.auid = auther_id;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getAuther_id() {
        return auid;
    }

    public void setAuther_id(Long auther_id) {
        this.auid = auther_id;
    }

    public Long getArticle_id() {
        return arid;
    }

    public void setArticle_id(Long article_id) {
        this.arid = article_id;
    }
}
