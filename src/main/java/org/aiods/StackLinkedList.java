package org.aiods;

import java.util.EmptyStackException;
import java.util.List;

public class StackLinkedList<T> {

    private static class StackNode<T>{
        T data;
        StackNode<T> next;

        StackNode(T data){
            this.data=data;
        }
    }
    StackNode<T> topNode;
    void push(T data){
        StackNode<T> t= new StackNode<>(data);
        t.next=topNode;
        topNode=t;
    }

    T peek(){
        if (topNode==null) throw new EmptyStackException();
       return topNode.data;
    }

    T pop(){
        if (topNode==null) throw new EmptyStackException();
        T d= topNode.data;
        topNode=topNode.next;
    return d;
    }

    public static void main(String[] args) {
        StackLinkedList<Integer> stackLinkedList= new StackLinkedList<>();
        stackLinkedList.push(1);
        stackLinkedList.push(2);
        stackLinkedList.push(3);
        stackLinkedList.push(4);
        stackLinkedList.push(5);
        System.out.println(stackLinkedList.peek());
        System.out.println(stackLinkedList.pop());
        System.out.println(stackLinkedList.peek());


    }


}
