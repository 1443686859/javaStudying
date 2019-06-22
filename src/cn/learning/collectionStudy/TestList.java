package cn.learning.collectionStudy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {
    public static void main(String args[]){
        List list = new ArrayList();
        list.add( "Hello");
        list.add( "World");
        list.add(1,  "Learn");
        list.add(1,  "Java");
        printList(list);
    }
    public static void printList(List list){
//1
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
