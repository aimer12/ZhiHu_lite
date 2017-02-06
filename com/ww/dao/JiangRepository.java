package com.ww.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

/**
 * Created on 2016/11/3.
 */
public interface JiangRepository extends CrudRepository<Jiang, Long> {

//    Page<Jiang> findAll(Pageable pageable);

    Page<Jiang> findByAuid(Long id, Pageable pageable);

    Page<Jiang> findByArid(Long id, Pageable pageable);




}
