package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public Account accountGenerator(){
        return new PersonalAccount("110-234-234234", 1000);

    }


    @Bean
    public MemberDTO memberGenerator(){
        //1. 생성자 주입
//        return new MemberDTO(1,"홍길동", "010-1234-1234", "hong@gmail.com", accountGenerator());
        //2. setter 주입
        MemberDTO member = new MemberDTO();
        member.setSequence(1);
        member.setName("유관순");
        member.setPhone("010-1234-1234");
        member.setEmail("you@gmail.com");
        //setter를 통해 Account를 생성하는 메소드를 호출한 리턴 값을 전달하여 bean을 조립할 수 있다.
        member.setPersonalAccount((accountGenerator()));

        return new MemberDTO();
    }
}
