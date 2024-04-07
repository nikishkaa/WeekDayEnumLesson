package by.itstep.goutor.javalesson.controller;

import by.itstep.goutor.javalesson.model.entity.WeekDay;

public class Main {
    public static void main(String[] args) {
        WeekDay monday1 = new WeekDay();
        WeekDay monday2 = monday1;
    test(11);
    }

    static void test(int number){
        switch (number){
            case 1 : break;
            case 2 : break;
            case 3 : break;
            case 4 : break;
            case 5 : break;
            default: break;
        }
    }
}
