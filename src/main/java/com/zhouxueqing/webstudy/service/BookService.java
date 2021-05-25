package com.zhouxueqing.webstudy.service;


import com.zhouxueqing.webstudy.dao.BookDao;
import com.zhouxueqing.webstudy.bean.Book;

import javax.swing.*;
import java.util.List;

public class BookService {
    private BookDao bookDao = new BookDao();

    public List<Book> searchAllBooks(int pageNum, int pageSize) {

        List<Book> books = bookDao.selectAll(pageNum, pageSize);

        return books;
    }

    public int countNum() {

        return bookDao.count();
    }
}