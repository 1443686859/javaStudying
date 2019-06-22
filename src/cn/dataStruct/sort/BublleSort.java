package cn.dataStruct.sort;

/**
 * 冒泡排序的实现
 */
public class BublleSort {
    public void Change(int[] a, int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public void BulleSort(int a[]){
        int temp;
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length-i-1;j++){
            if(a[j]>a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }

        }
    }
    }
    public static void main(String[] args) {
        int[] a={10,4,5,9,7,2,4,30};
        new BublleSort().BulleSort(a);
        for (int i:a) {
            System.out.println(i);
        }
        System.out.println(a);
    }
}
