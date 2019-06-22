package cn.itcast.reflect;


import domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * Class对象功能：
 * 获取功能：
 * 1.获取成员变量们
 * Field[] getFields()： 获取所有public修饰的成员变量
 * Field getField(String name):获取指定名称的 public修饰的成员变量
 * Field[] getDeclaredFields():获取所有的成员变量不考虑修饰符
 * Field geDeclaredField(String name):获取指定名称的不考虑修饰符的成员变量
 * 2.获取构造方法们
 * Constructor<?>[] getConstructors()
 * Constructor<T> getConstructor(类<?>... parameterTypes)
 * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
 * Constructor<?>[] getDeclaredConstructors()
 * 3.获取成员方法们
 * Method[] getMethods()
 * Method getMethod(String name,类<?>... parameterTypes)
 * Method[] getDeclaredMethods()
 * Method getDeclaredMethod(String name,类<?>... parameterTypes)
 * 4.获取类名
 * String getName()
 *
 *
 *
 *
 * Field:成员变量
 *  操作：
 *      1.设置值：
 *       void set(Object obj, Object value)
 *      2.获取值：
 *           get(Object obj)
 *      3.忽略访问权限修饰符的安全检查
 *          setAccessible(true)：暴力反射
 *
 *
 *  Constructor:构造方法
 *      创建对象：newInstance(Object....initargs)
 *      如果使用空参数的构造方法创建对象，操作可以简化：Class对象的呢我Instance()方法
 *
 *Method 方法对象
 * 执行方法：
 *  object：invoke(object obj,object ...args)
 * 执行方法名称：
 *  String getName():获取方法名
 *
 *
 *实现：
 *  需求：编写一个 "框架"，可以帮我们创建任意类的对象，并执行其中的任意方法
 *
 */
public class ReflectDemo2 {

    public static void main(String[] args) throws Exception {
        //1.获取Person的类对象
        Class personClass= Person.class;
        //2.获取personclass对应的方法
        Field[] fields=personClass.getFields();
        for(Field field:fields)
        System.out.println(field);
        Field a= personClass.getField("a");
        Constructor constructor = personClass.getConstructor();
        Person person =(Person) constructor.newInstance();
        System.out.println(a.get(person));//获取对应对象的成员变量
//        成员变量赋值
        a.set(person,"张三");
        System.out.println(person.a);
        Field age = personClass.getDeclaredField("d");
//     age.get(person);
        //忽略访问权限修饰符的安全检查
        age.setAccessible(true);//暴力反射破解private
        System.out.println(age.get(person));

    }
}
