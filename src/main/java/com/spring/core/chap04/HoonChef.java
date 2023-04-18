package com.spring.core.chap04;

import org.springframework.stereotype.Component;

@Component("hc")
public class HoonChef implements Chef {

    public void cook(){

        System.out.println("한식 요리의 대가 훈입니다");
    }


}
