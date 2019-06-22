package cn.learning.stringstudy;
//import java.util.collection
/**
 * 引用的传递相当于将对应的指针地址传递，使得指向同一个地址，故可以改变对应对象的内容，但是若在方法内改变参数的地址，使其重新指向一个内存地址，做出的改变是无法影响实际参数的
 * 基本类型的值传递是将对应值复制后传给参数
 */
public class HashCode {
    public static String string="123456";
    public void change(String str){
        str="123456";//指向常量池中的"123456"
        str="12345";
        System.out.println(str.hashCode());
    }
    public static void main(String[] args) {
        new HashCode().change(string);
        System.out.println(string.hashCode());
    }
}
