package com.yyq.factory.normal;

import com.yyq.bean.easy_normal.Dog;
import com.yyq.bean.easy_normal.IAnimal;

/**
 * @author: 布里巴
 * @date: 2020/9/7
 */
public class DogFactory implements IAnimalFactory {
    public IAnimal create() {
        return new Dog();
    }
}
