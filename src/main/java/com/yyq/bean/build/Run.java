package com.yyq.bean.build;

import com.yyq.build.StudentBuilder;

/**
 * @author: 布里巴
 * @date: 2020/9/10
 */
public class Run {
    /**
     * 优点
     *  1.封装性好
     *  2.扩展性好
     * 缺点
     *  1.产生多余Builder对象
     *  2.产品内部发生变化，需要修改建造者
     *
     *  应用：1.StringBuilder 2.SqlSessionFactoryBuilder 3.BeanDefinitionBuilder
     *
     */
    public static void main(String[] args) {
        StudentBuilder builder = new StudentBuilder();
        Student yyq = builder.name("yyq").age(11).build();
        System.out.println(yyq);
    }
}
