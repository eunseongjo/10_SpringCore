package com.ohgiraffers.common;

public interface Account {
    //잔액조회
    String getBalance();
    //입금
    boolean deposit(int money);
    //출금
    boolean withDraw(int money);
}
