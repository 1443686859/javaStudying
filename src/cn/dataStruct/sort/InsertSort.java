package cn.dataStruct.sort;

public class InsertSort {
    public void insert(int[] a, int index,int number){
        if(index>=a.length||index<0){
            return ;
        }
        for(int i=a.length-1;i>index;i--){
             a[i]=a[i-1];
        }
        a[index]=number;
    }
    public int delete(int[] a,int index){
        if(index>=a.length||index<0){
            return 0;
        }
        int number=a[index];
        for (int i = index; i <a.length-1 ; i++) {
            a[i]=a[i+1];
        }
        a[a.length-1]=0;
        return number;
    }
    public void InsertSort(int[] a){
        for (int i = 1; i < a.length; i++)
        {
            int j;
            if (a[i] < a[i - 1])//减少移动次数，将等于不移动
            {
                int temp = a[i];
                for (j = i - 1; j >= 0 && temp < a[j]; j--)//一直小于一直移动
                {
                    a[j + 1] = a[j];
                }
                a[j + 1] = temp;
            }


            for (int k:a) {
                System.out.print(k+" ");
            }
            System.out.println();
    }}

    public static void main(String[] args) {
        int [] a={10,4,5,9,7,2,4,30};
       InsertSort insertSort= new InsertSort();
       insertSort.InsertSort(a);
        System.out.println(a.length);
//         System.out.println(new InsertSort().InsertSort(a));
        for (int i:a
             ) {
            System.out.println(i);
        }
    }
}
