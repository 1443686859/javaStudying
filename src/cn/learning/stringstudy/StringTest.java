package cn.learning.stringstudy;
       /* 创建一个字符串时，首先会检查池中是否有值相同的字符串对象，如果有就直接返回引用，不会创建字符串对象；
        如果没有则新建字符串对象，返回对象引用，并且将新创建的对象放入池中。但是，
        通过new方法创建的String对象是不检查字符串常量池的，
        而是直接在堆中创建新对象，也不会把对象放入池中。上述原则只适用于直接给String对象引用赋值的情况。*/




public class StringTest {
    private static final void change(int a){
        a++;
        System.out.println("方法中的值"+a);
    }
    public static void main(String[] args) {

        String str1="123456";
//
        String  str2="123456";
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        String str3=new String("123456");
        System.out.println(str1==str3);//比较hashcode判断相同引用
        System.out.println(str1.equals(str3));//内容相同，String重写了equal方法
        System.out.println(str1.hashCode());
        str1+="123";
        System.out.println(str1.hashCode());
        int a='1';
        System.out.println(a);
        change(a);
        System.out.println(a);//不改变原来的值，只是将值传过去
        ((StringTest)null).getMethod();
        StringTest stringTest=new StringTest();
        System.out.println(stringTest.GetUglyNumber_Solution(1000));
    }
    private  static void getMethod(){
        System.out.println("testMethod");
    }
    public int GetUglyNumber_Solution(int index) {
        if (index < 7) return index;
        int[] ret = new int[index];
        ret[0] = 1;
        int i = 0, j = 0, k = 0;
        for (int n = 1; n < index; n++) {
            ret[n] = finMin(ret[i] * 2, ret[j] * 3, ret[k] * 5);
            if (ret[n] == ret[i] * 2) i++;
            if (ret[n] == ret[j] * 3) j++;
            if (ret[n] == ret[k] * 5) k++;
        }
        return ret[index - 1];
    }
    private  int finMin(int a,int b,int c){
        int min = Math.min(a,Math.min(b,c));
        return min == a ? a:min==b?b:c;
    }}
