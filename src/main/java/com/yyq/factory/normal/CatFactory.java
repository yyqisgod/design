package com.yyq.factory.normal;

import com.yyq.bean.easy_normal.Cat;
import com.yyq.bean.easy_normal.IAnimal;

/**
 * @author: 布里巴
 * @date: 2020/9/7
 */
public class CatFactory implements IAnimalFactory {
    public IAnimal create() {
        return new Cat();
    }
}
