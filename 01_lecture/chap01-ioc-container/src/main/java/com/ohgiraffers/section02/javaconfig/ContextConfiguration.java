package com.ohgiraffers.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

    @Configuration //해당 클래스가 설정파일이 되고, 빈을 생성하는 클래스임을 표기한다.
public class ContextConfiguration {
    @Bean
        public MemberDTO getMember(){
        return new MemberDTO(1,"user01", "pass01", "홍길동");
    }
}
