package cn.learning.collectionStudy;

public class Main {
    /**
     * 我的想法：
     * 我认为泛式是定义在一种类上的一系列操作的抽象
     * @param <T>
     */
    public static  class Test<T>{
        //定义静态泛式

        //        public static T t;//编译器报错无法解析类T，
        // 由于在调用静态类、静态方法的时候可能未指定也可能无法指定类T，
        // 所以直接报错，这是我的想法

//        public static void func1(T t){}理由同上

        /**
         * 我的想法
         * 方法之所以能够通过编译在于每次的方法调用的时候已经指定好类K了
         * @param k
         * @param <K>
         * @return
         */
        public static <K> K tell(K k){//指定类K为参数的类
            return k;
        }

        /**
         * 泛式数组
         * @param k
         * @param <K>
         * @return
         */
        public static <K> K[] tell(K[] k){
            return k;
        }
    }
}
