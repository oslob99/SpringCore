package com.spring.core.chap01;

public class EsternRestaurant implements Restaurant{

    private Chef chef = new HoonChef();

    // 요리 코스
    private Course course = new SushiCourse();

    // 용리를 주문하는 기능
    public void order(){
        System.out.println("동양 요리를 주문");
        course.combineMenu();
        chef.cook();
    }

}
