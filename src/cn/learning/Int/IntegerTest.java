package cn.learning.Int;

public class IntegerTest {
//    @SuppressWarnings("")
    int b;//类中定义
    char c;//类变量
    public static void main(String[] args) {
        int a=1;//定义整型变量a数值为1；
        int b; // 定义整型变量b 在方法中未初始化没有值(无法输出) 在类定义时可有默认值为0；
        //非基本数据类型，在类定义时，未经初始化有默认值，一般都为零，
        //引用类型在类定义时，默认值为null
        /**
         * String:null
         * int:0
         * char:    //为空即为''
         * short:0
         * float:0.0
         * long:0
         * double:0.0
         * byte:0
         * boolean:false
         * Object:null
         */
        Integer integer=a;//强行装换是可以的；
        System.out.println(new IntegerTest().b);//输出为零
        //System.out.println(b);//无法输出编译报出
        short i=1;
        Short aShort=i;//直接转换，直接包装好
        /**
         * 在 JDK1.5 引入自动装箱和拆箱的机制后，包装类和基本类型之间的转换就更加轻松便利了。可以自动装拆箱了
         */
        System.out.println();
        System.out.println(aShort.getClass());//class java.lang.Short
        short s=aShort.shortValue();
        short d=aShort;//直接拆包装
        System.out.println(d);
        long l=aShort.longValue();
        System.out.println(s);
        System.out.println(l);
        /**
         * 包装类可以直接将基本类型直接装入
         */
    }
}
