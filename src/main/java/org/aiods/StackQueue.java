package org.aiods;

import java.util.NoSuchElementException;

public class StackQueue<T> {
    private  static class QueueNode<T>{
        T data;
        QueueNode<T> next;
        QueueNode(T data){
            this.data=data;
        }
    }
   QueueNode<T> first;
   QueueNode<T> last;

   void addElement(T data){
       QueueNode<T> t= new QueueNode<>(data);
       if (last!=null){
           last.next=t;
       }
       last=t;
       if (first==null){
           first=last;
       }
   }

   T removeElement(){
       if (first==null) throw  new NoSuchElementException();
       T data= first.data;
       first=first.next;
       return  data;
   }

    T peek(){
        if (first==null) throw  new NoSuchElementException();

        return  first.data;
    }

    public static void main(String[] args) {
        StackQueue<Integer> stackQueue= new StackQueue<>();
        stackQueue.addElement(1);
        stackQueue.addElement(2);
        stackQueue.addElement(3);
        stackQueue.addElement(4);
        System.out.println(stackQueue.peek());
        System.out.println(stackQueue.removeElement());
        System.out.println(stackQueue.peek());
    }

}
