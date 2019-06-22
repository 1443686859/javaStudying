package cn.itcast.reflect;

/**
 * 框架：半成品软件。可以在框架的基础上进行软件开发，简化编码
 * 反射：将类的各个组成部分封装为其他对象，这就是反射机制。
 *      1.可以在程序运行过程中，操作这些对象。
 *      2.可以解耦，提高程序的可拓展性
 *
 *java文件的使用流程:共三个阶段
 * 第一阶段：Source源代码阶段（在硬盘上）
 * 通过编译生成class文件，javac。字节码文件（class）存放着类的成员变量，累的成员方法，类的构造器等。
 *
 *
 * 第二阶段：类对象阶段类加载器（classloader）
 *  根据类加载器对class文件生成Class 类对象，
 *      成员变量：Field[] 属性名 fields
 *      构造方法：Constructor[] 属性名 constructors
 *      成员方法： Method [] 属性名 methods
 *
 *
 * 第三阶段：Runtime运行时阶段
 *  使用new 关键字生成对象
 *
 */
public class ReflectDemo1 {

}
