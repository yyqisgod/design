package com.yyq.factory.abstracts;

/**
 * @author: 布里巴
 * @date: 2020/9/7
 */
public class Run {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new Dog();
        animalFactory.createCry().cry();
        animalFactory.createSmell().semll();
    }
}
