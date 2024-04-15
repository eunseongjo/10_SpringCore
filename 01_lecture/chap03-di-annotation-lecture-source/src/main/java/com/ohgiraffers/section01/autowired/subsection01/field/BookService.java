package com.ohgiraffers.section01.autowired.subsection01.field;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// @Service :  @Component의 세분화 어노테이션의 한 종류로 Service 계층에서 사욯한다.
@Service("bookServiceField")
public class BookService {

    @Autowired
    private BookDAO bookDAO;

    public List<BookDTO> selectAllBooks() {
        return bookDAO.selectBookList();
    }

    public BookDTO searchBySequence(int sequence) {
        return bookDAO.selectOneBook(sequence);
    }
}
