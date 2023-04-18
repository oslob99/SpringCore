package com.spring.core.chap04.config;

import com.spring.core.chap04.Hotel;
import com.spring.core.chap04.config.HotelAutoConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class HotelAutoConfigTest {

    AnnotationConfigApplicationContext ac =
            new AnnotationConfigApplicationContext(HotelAutoConfig.class);
    @Test
    void springDITest(){
//        스프링 컨테이너에서 등록된 객체를 가져오기
        com.spring.core.chap04.Hotel hotel = ac.getBean(Hotel.class);
        hotel.inform();
    }
}