package cn.itcast.reflect;

import domain.Person;

import java.lang.reflect.Constructor;

public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        Class personClass= Person.class;
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        Object person=constructor.newInstance("张三",23);
        System.out.println(person);
        System.out.println("----------------");
        Constructor constructor1 = personClass.getConstructor();
        System.out.println(constructor1);
        Person person1 =(Person) constructor1.newInstance();
        System.out.println(person1);
        Object person2 = personClass.newInstance();//简化生成对象，使用空参方法构造
        constructor.setAccessible(true);//暴力破解
        System.out.println(person2);
    }
}
