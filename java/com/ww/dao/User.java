package com.ww.dao;

import javax.persistence.*;

/**
 * Created  on 2016/11/7.
 */

@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Column(nullable = false)
    private String Name;








}
