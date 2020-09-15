package com.yyq.factory.abstracts;

import com.yyq.bean.abstracts.DogCry;
import com.yyq.bean.abstracts.DogSmell;
import com.yyq.bean.abstracts.ICry;
import com.yyq.bean.abstracts.ISmell;

/**
 * @author: 布里巴
 * @date: 2020/9/7
 */
public class Dog extends AnimalFactory{
    @Override
    public ICry createCry() {
        super.init();
        return new DogCry();
    }

    @Override
    public ISmell createSmell() {
        super.init();
        return new DogSmell();
    }
}
