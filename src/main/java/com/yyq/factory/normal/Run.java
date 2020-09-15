package com.yyq.factory.normal;

/**
 * @author: 布里巴
 * @date: 2020/9/7
 */
public class Run {
    public static void main(String[] args) {
        IAnimalFactory animalFactory = new DogFactory();
        animalFactory.create().say();
    }
}
