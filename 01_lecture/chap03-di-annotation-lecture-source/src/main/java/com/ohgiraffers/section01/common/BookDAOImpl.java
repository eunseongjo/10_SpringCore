package com.ohgiraffers.section01.common;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("bookDAO")
public class BookDAOImpl implements BookDAO{

    //@Component의 세분화 어노테이션의 한 종류로 DAO타입의 객체를 사용한다.
    private final Map<Integer, BookDTO> bookList;

    public BookDAOImpl(){
        bookList = new HashMap<>();
        bookList.put(1, new BookDTO(1, 1234, "자바의 정석", "남궁성", "도우출판", new java.util.Date()));
        bookList.put(2, new BookDTO(2, 1234, "자바의 정석", "남궁성", "도우출판", new java.util.Date()));
    }

    @Override
    public List<BookDTO> selectBookList() {
        return new ArrayList<>(bookList.values());
    }

    @Override
    public BookDTO selectOneBook(int sequence) {
        return bookList.get(sequence);
    }
}
