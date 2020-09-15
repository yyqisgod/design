package com.yyq.factory.abstracts;

import com.yyq.bean.abstracts.ICry;
import com.yyq.bean.abstracts.ISmell;

/**
 * @author: 布里巴
 * @date: 2020/9/7
 */
public abstract class AnimalFactory {
    public void init(){
        System.out.println("初始化完成");
    }

    public abstract ICry createCry();

    public abstract ISmell createSmell();
}
