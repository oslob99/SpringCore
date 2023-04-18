package com.spring.core.chap03;

public class EsternRestaurant implements Restaurant {

    private Chef chef;

    // 요리 코스
    private Course course;

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
