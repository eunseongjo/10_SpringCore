package com.ohgiraffers.section01.common;

import lombok.*;

import java.util.Date;

//lombok 라이브러리 사용
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BookDTO {

 private int sequence;
 private int isbn;
 private String title;
 private String author;
 private String publisher;
 private Date createdDate;
}
