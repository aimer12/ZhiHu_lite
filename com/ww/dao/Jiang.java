package com.ww.dao;

import javax.persistence.*;

/**
 * Created  on 2016/11/7.
 */

@Entity
@Table(name = "JIANG")
public class Jiang {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(nullable = false)
    private Long auid;

    @Column(nullable = false)
    private Long arid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAuid() {
        return auid;
    }

    public void setAuid(Long auther_id) {
        this.auid = auid;
    }

    public Long getArid() {
        return arid;
    }

    public void setArid(Long article_id) {
        this.arid = arid;
    }
}
