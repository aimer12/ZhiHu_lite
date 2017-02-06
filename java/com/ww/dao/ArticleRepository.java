package com.ww.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by on 2016/11/3.
 */
public interface ArticleRepository extends CrudRepository<Article, Long> {

    Page<Article> findAll(Pageable pageable );

    List<Article> findAllByOrderByJiangAsc();

    List<Article> findAllByAutherOrderByCreateTimeAsc(Long id);

    List<Article> findAllByAutherOrderByJiangAsc(Long id);

}
