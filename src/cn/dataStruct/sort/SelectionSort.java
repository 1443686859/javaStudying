package cn.dataStruct.sort;

/**
 * 每一趟在n-i+1(i=1,2,...,n-1)个记录中选取关键字最小的记录作为有序序列中第i个记录。
 * 具体来说，假设长度为n的数组arr，要按照从小到大排序，那么先从n个数字中找到最小值min1，
 * 如果最小值min1的位置不在数组的最左端(也就是min1不等于arr[0])，
 * 则将最小值min1和arr[0]交换，接着在剩下的n-1个数字中找到最小值min2，
 * 如果最小值min2不等于arr[1]，则交换这两个数字，依次类推，直到数组arr有序排列。
 * 算法的时间复杂度为O(n^2)。
 */
public class SelectionSort {
    public void Change(int[] a, int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public int GetSmallestNumberIndex(int[] a,int start,int end){
        int smallestIndex=start;
        for(int i=start;i<end;i++){
            if(a[smallestIndex]>a[i])
                smallestIndex=i;
        }
        return smallestIndex;
    }
    public void SelectionSort(int[] a){
        int index;
        for(int i=0;i<a.length;i++){

                    index=GetSmallestNumberIndex(a,i,a.length);
                    Change(a,i,index);

        }
    }

    public static void main(String[] args) {
        int[] a={10,4,5,9,7,2,4,30};
        new SelectionSort().SelectionSort(a);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}
