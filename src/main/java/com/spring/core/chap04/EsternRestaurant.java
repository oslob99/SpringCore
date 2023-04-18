package com.spring.core.chap04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EsternRestaurant implements Restaurant {

    private Chef chef;

    // 요리 코스
    private Course course;

    @Autowired // 컨테이너에 등록된 객체를 알아서 주입좀 해줘
    public EsternRestaurant(Chef chef, Course course) {
        this.chef = chef;
        this.course = course;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    // 용리를 주문하는 기능
    public void order(){
        System.out.println("동양 요리를 주문");
        course.combineMenu();
        chef.cook();
    }

}
