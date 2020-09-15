package com.yyq.decorator;

/**
 * @author: 布里巴
 * @date: 2020/9/10
 */
public class EggDecorator extends BatterCakeDecorator {
    public EggDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    public String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    public Integer getPrice() {
        return super.getPrice() + 1;
    }
}
