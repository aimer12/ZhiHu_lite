package com.ww.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ww.dao.Article;
import com.ww.dao.ArticleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created on 2016/10/25.
 */

@RestController
@RequestMapping(value="/article")
public class ArticleController {

    private static final Logger log = LoggerFactory.getLogger(ArticleController.class);

    @Autowired
    ArticleRepository repository;

    ObjectMapper mapper = new ObjectMapper();


    @RequestMapping(value="/", method= RequestMethod.GET)
    public String  getAllArticle() throws JsonProcessingException {

        Pageable pageable = new PageRequest(0,10);
        Page<Article> articles = repository.findAll(pageable);

        String jsonInString = mapper.writeValueAsString(articles);
        return jsonInString;
    }

    @RequestMapping(value="/comments/{article}", method=RequestMethod.GET)
    public List<String> getComments(@PathVariable String article) {
        return Arrays.asList("comment1", "comment2", article);
        // ...
    }
//
    @RequestMapping(value="/jiang/{comments}", method=RequestMethod.DELETE)
    public int getJiang(@PathVariable String comments) {
        return 3;
        // ...
    }


}
