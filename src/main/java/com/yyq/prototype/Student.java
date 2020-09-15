package com.yyq.prototype;

import lombok.Data;

import java.io.*;

/**
 * @author: 布里巴
 * @date: 2020/9/8
 */
@Data
public class Student implements Cloneable,Serializable {

    private String name;

    /**
     * 浅克隆,不能克隆对象中有其它对象引用的对象
     *
     * @return
     */
    @Override
    protected Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 序列化实现深克隆
     * @return
     */
    public Student deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return  (Student) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
