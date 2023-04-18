package com.spring.core.chap01;

public class WesternRestaurant implements Restaurant{

    private Chef chef = new JannChef();

    // 요리 코스
    private Course course = new FrenchCourse();

    // 용리를 주문하는 기능
    public void order(){
        System.out.println("서양 요리를 주문");
        course.combineMenu();
        chef.cook();
    }

}
