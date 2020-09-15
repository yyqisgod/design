package com.yyq.template;

/**
 * @author: 布里巴
 * @date: 2020/9/11
 */
public abstract class Study {
    public void study(){
        System.out.println("学习英语");
        System.out.println("学习美术");
        if(needSleep()){
            sleep();
        }
        System.out.println("学习数学");
    }

    //钩子函数
    protected boolean needSleep(){
        return false;
    }

    abstract void sleep();
}
