package com.kuang.service;

import com.kuang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {



    int addBook(Books books);

    int deleteBookById(@Param("bookid") int bookID);

    int updateBook(Books books);

    Books queryBook(@Param("id") int bookID);

    List<Books> queryAllBooks();

    Books queryBookbyName(@Param("name") String name);




}
