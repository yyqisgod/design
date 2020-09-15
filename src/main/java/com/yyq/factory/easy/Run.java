package com.yyq.factory.easy;

import com.yyq.bean.easy_normal.Cat;
import com.yyq.bean.easy_normal.Dog;

/**
 * @author: 布里巴
 * @date: 2020/9/7
 */
public class Run {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        animalFactory.create(Dog.class).say();
        animalFactory.create(Cat.class).say();
    }
}
