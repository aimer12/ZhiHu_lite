package com.ww.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created  on 2016/11/3.
 */
public interface CommentRepository extends CrudRepository<Comment, Long> {

    Page<Comment> findAll(Pageable pageable);

    Page<Comment> findByAuid(Long id, Pageable pageable);

    Page<Comment> findByArid(Long id, Pageable pageable);

    List<Comment> findByAuidAndArid(Long au_id, Long ar_id);



}
