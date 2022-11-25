package com.zy.service;
import  com.zy.domain.Book;
import com.zy.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {
    @Autowired
    private BookService bookService;
    
    @Test
    public void save(){
        Book book1 = new Book();
        book1.setType("测试");
        book1.setName("测试");
        book1.setDescription("测试");
        bookService.save(book1);
        System.out.println(book1);
    }
    @Test
    public void delete(){
        bookService.delete(7);
    }
    
    @Test
    public void testGetById(){
        Book book = bookService.getById(1);
        System.out.println(book);
    }
    
    @Test
    public void testGetAll(){
        List<Book> all = bookService.getAll();
        System.out.println(all);
    }
}
