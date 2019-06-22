package cn.learning.array;

public class ArrayClone {
    public static void main(String[] args) {
        Integer [] arr1={1,2,3,4,5,};
        Integer [] arr2=new Integer[arr1.length];
        Integer a1=11;
         long [] a={1,2,3,4,5,};
        System.out.println(arr1.getClass().getName());
        System.out.println(a.getClass().getName());
        System.arraycopy(arr1,0,arr2,0,arr1.length);
        System.out.println(arr1.hashCode());
        System.out.println(arr2.hashCode());
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i].intValue());
        }
        Object object=new Object();
        Integer [] arr3=arr1.clone();//调用继承自Object 类的Clone方法，可以复制整个对象，即在堆中新开一个对象
        System.out.println(arr3.hashCode());
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i].intValue());
        }
        System.out.println("卧槽");
    }
}
