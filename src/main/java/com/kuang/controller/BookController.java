package com.kuang.controller;


import com.kuang.pojo.Books;
import com.kuang.service.BookService;
import com.kuang.service.BookServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //controller 调service层
    @Qualifier("bookServiceImpl")
    @Autowired
    private BookService bookService;


    // 查询所有书籍，并且返回一个书籍的展示页面
    @RequestMapping("/allbook")
    public String list(Model model){

        List<Books> books = bookService.queryAllBooks();

        model.addAttribute("list",books);

        return "allbook";
    }

    //跳转到增加书籍页面
    @RequestMapping("/toaddbook")
    public String addBookPage(Object o){

        

        return "addbook";
    }


     //添加书籍请求
     @RequestMapping("/addbook")
     public String addBook(Books books){
        System.out.println("addBook=>" + books );
       bookService.addBook(books);
        return "redirect:/book/allbook";
    }


    //跳转到修改页面
    @RequestMapping("/toupdatebook/{id}")
    public String toUpdateBook(@PathVariable("id") int id, Model model){
        Books books = bookService.queryBook(id);

        model.addAttribute("Qbook",books);

        return "toupdatebook";
    }


      //修改书籍
    @RequestMapping("/updatebook")
    public String updateBook(Books books){
        System.out.println(books);
         bookService.updateBook(books);

        return "redirect:/book/allbook";
    }

    @RequestMapping("/deletebook/{id}")
    public String deleteBook(@PathVariable("id") int id){
        bookService.deleteBookById(id);

        return "redirect:/book/allbook";
    }


    //查询书籍

    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model){

        Books books = bookService.queryBookbyName(queryBookName);
        List<Books> list = new ArrayList<Books>();
        list.add(books);

        if(books == null){
            list = bookService.queryAllBooks();
            model.addAttribute("error","未查到");
        }


        model.addAttribute("list",list);
        return "allbook";

    }




    


}
