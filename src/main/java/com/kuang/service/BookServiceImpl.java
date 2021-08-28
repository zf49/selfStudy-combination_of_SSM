package com.kuang.service;

import com.kuang.dao.BookMapper;
import com.kuang.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookServiceImpl implements BookService {
       // 业务层调用Dao层组合Dao
   @Autowired
   private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }


    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int bookID) {
        return bookMapper.deleteBookById(bookID);
    }


    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }


    public Books queryBook(int bookID) {
        return bookMapper.queryBook(bookID);
    }


    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }

    public Books queryBookbyName(String name) {
        return bookMapper.queryBookbyName(name);
    }


}
