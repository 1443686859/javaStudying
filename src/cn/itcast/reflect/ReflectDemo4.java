package cn.itcast.reflect;

import domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
      //获取方法
        Class personClass= Person.class;
        Person person=new Person();
        Method eat = personClass.getMethod("eat");
        eat.invoke(person);
       Method eat2= personClass.getMethod("eat",String.class);
        eat2.invoke(person,"people");//使用带参数方法，后面为方法的参数
        Method[] methods=personClass.getMethods();
        for(Method method : methods){
            System.out.println(method);//打印隐藏方法包括继承自object
            System.out.println(method.getName());
//            method.setAccessible(true);
        }
    }
}
