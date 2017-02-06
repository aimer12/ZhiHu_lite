package com.ww;

import com.ww.dao.Article;
import com.ww.dao.ArticleRepository;
import com.ww.dao.Comment;
import com.ww.dao.CommentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Calendar;
import java.util.List;

/**
 * Created on 2016/11/3.
 */

@RunWith(SpringRunner.class)
@DataJpaTest
//@ContextConfiguration
public class ArticleRepositoryTests {

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private CommentRepository commentRepository;

    @Test
    public void testFindByID(){
        Article article = new Article("title","maybe large", 1, Calendar.getInstance().getTime(), 1L);

        articleRepository.save(article);

        List<Article> article1 = articleRepository.findAllByAutherOrderByJiangAsc(1L);
//        article1.setTitle("test upatea");
//        article1.setContext("test update");
        articleRepository.save(article1);
        System.out.println(articleRepository.findAll());


//        Assert.assertEquals(article1.getJiang(), 1);
    }

    @Test
    public void testComment(){
        Comment comment = new Comment("test comment", 1L, 1L);

        commentRepository.save(comment);

        Pageable pageable = new PageRequest(0,10);
        Page<Comment> comment1 = commentRepository.findByArid(1L, pageable);
        commentRepository.save(comment1);


    }

    @Test
    public void testOperation(){
        int a = 0b111;
        byte b = 0b1100110;
        Byte c = b;
        System.out.println(a + "  "+ c.toString());
    }

    @Test
    public void testMima(){
        String reStr=null;


    }
}
