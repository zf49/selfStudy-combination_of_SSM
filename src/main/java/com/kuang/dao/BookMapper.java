package com.kuang.dao;

import com.kuang.pojo.Books;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

//    增

    int addBook(Books books);


//            删
    int deleteBookById(@Param("bookid") int bookID);

//        改
    int updateBook(Books books);

//                查
    Books queryBook(@Param("id") int bookID);

    List<Books> queryAllBooks();

    Books queryBookbyName(@Param("name") String name);

//
//
//
}
