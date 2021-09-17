package com.waitfor.study;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 类型描述
 *
 * @author zhouliang
 * @since 2021-3-29下午 1:18
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(16, "Alice");
        Student student5 = new Student(16, "Alice");
        Student student2 = new Student(16, "Bob");
        Student student3 = new Student(17, "Cherry");
        Student student4 = new Student(17, "Delivery");
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        // List to Map<Object, List>
        // 1. 首先使用`Collectors.groupingBy()根据某个字段进行分组`
        // 2. 分组的同时使用`Collectors.mapping()`将分组后的数据组织起来
        Map<Integer, List<String>> map = studentList.stream()
                .collect(
                        Collectors.groupingBy(Student::getAge,
                                Collectors.mapping(Student::getName, Collectors.toList())));
        System.out.println(map);

        // 这里将分组后的数据组织成一个Map
        /*Map<Integer, Map<String, Student>> map2 = studentList.stream()
                .collect(
                        Collectors.groupingBy(Student::getAge,
                                Collectors.toMap(Student::getName, student -> student)));
        System.out.println(map2);*/

        Map<Integer, Map<String, List<Student>>> map3 = studentList.stream()
                .collect(
                        Collectors.groupingBy(Student::getAge,
                                Collectors.groupingBy(Student::getName,Collectors.toList())));
        System.out.println(map3);

    }
}

class Student {

    private String name;

    private Integer age;

    Student(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
