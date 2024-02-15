package org.aiods;

import java.util.EmptyStackException;

public class MyStack<T> {
  private  static class MyNode<T>{
      private  T data;
      private  MyNode<T> next;

      MyNode(T data){
          this.data=data;
      }
  }

  MyNode<T> top;

  void push(T data){
      MyNode t= new MyNode(data);
      t.next=top;
      top=t;
  }
  T pop(){
      if (top==null) new EmptyStackException();
      T data= top.data;
      top = top.next;
      return  data;
  }
    T peek(){
        if (top==null) new EmptyStackException();
        return  top.data;
    }

    public static void main(String[] args) {
        MyStack myStack =new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
    }
}
