package com.yyq.build;

import com.yyq.bean.build.Student;
import lombok.Data;

/**
 * @author: 布里巴
 * @date: 2020/9/10
 */
@Data
public class StudentBuilder {

    Student student = new Student();

    public StudentBuilder name(String name){
        this.student.setName(name);
        return this;
    }

    public StudentBuilder age(Integer age){
        this.student.setAge(age);
        return this;
    }

    public Student build(){
        return this.student;
    }
}
