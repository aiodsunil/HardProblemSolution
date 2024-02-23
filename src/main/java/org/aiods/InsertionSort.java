package org.aiods;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InsertionSort {
    public static void main(String[] args) {
        List<Integer> unsorted= Stream.of(1,4,5,6,1).collect(Collectors.toList());
        System.out.println(unsortedList(unsorted));

    }

   static List<Integer> unsortedList(List<Integer> list){

       for (int i = 0; i <list.size() ; i++) {
           int current=i;
           while (current>0 && list.get(current-1)>list.get(current)){
               int temp=list.get(current);
               list.set(current,list.get(current-1));
               list.set(current-1,temp);
               current--;
           }

       }

        return  list;
    }
}
