package com.yyq.prototype;

/**
 * @author: 布里巴
 * @date: 2020/9/8
 */
public class Run {
    /**
     * 优点：
     *  1.基于二进制流拷贝，比直接new对象性能高
     * 缺点：
     *  1.每个类都需要配置克隆方法，当需要对类改造时，需要修改代码
     *  2.深拷贝需要序列化反序列化，或者每一层对象都重写clone()，代码复杂度提高
     *
     *  应用：1.JSON.parseObject()  2.Spring Scope(prototype)模式
     */
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("a");

        System.out.println(student.clone());
        System.out.println(student.deepClone());
    }
}
