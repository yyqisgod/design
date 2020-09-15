package com.yyq.template;

/**
 * @author: 布里巴
 * @date: 2020/9/11
 */
public class Boy extends Study{
    private boolean needSleep = false;

    public void setNeedSleep(boolean needSleep) {
        this.needSleep = needSleep;
    }

    @Override
    protected boolean needSleep() {
        return this.needSleep;
    }

    @Override
    void sleep() {
        System.out.println("休息5分钟");
    }
}
