package org.aiods;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class ListStack<T> {
      ArrayList<T> arrayStack= new ArrayList<T>();

      void push(T data){
          arrayStack.add(data);

      }
      T  pop(){
          if (arrayStack.isEmpty()) throw  new EmptyStackException();
          return  arrayStack.remove(arrayStack.size()-1);
      }

    T  peek(){
        if (arrayStack.isEmpty()) throw  new EmptyStackException();
        return  arrayStack.get(arrayStack.size()-1);
    }

    public static void main(String[] args) {
        ListStack listStack= new ListStack();
         listStack.push(1);
         listStack.push(2);
         listStack.push(3);
         listStack.push(4);

        System.out.println(listStack.peek());
        System.out.println(listStack.pop());
        System.out.println(listStack.peek());
    }
}
