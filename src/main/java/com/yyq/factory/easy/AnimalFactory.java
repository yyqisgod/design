package com.yyq.factory.easy;

import com.yyq.bean.easy_normal.IAnimal;

/**
 * @author: 布里巴
 * @date: 2020/9/7
 */
public class AnimalFactory {
    public IAnimal create(Class<? extends IAnimal> className){
        if (className != null) {
            try {
                return className.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
