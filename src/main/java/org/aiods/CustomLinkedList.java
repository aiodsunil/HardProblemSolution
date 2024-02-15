package org.aiods;

import java.util.HashSet;

public class CustomLinkedList {
    int data;
    CustomLinkedList next=null;

    public CustomLinkedList(int data) {
        this.data=data;

    }

    void appendDataAtEnd(int data){
        CustomLinkedList customLinkedList= new CustomLinkedList(data);
        CustomLinkedList currentNode=this;
        while (currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=customLinkedList;
    }
    CustomLinkedList deleteNode(CustomLinkedList node,int data){
        while (node.next!=null){
            if (node.data==data){
                return node.next;
            }
        }
        return  node;
    }

    CustomLinkedList removeDuplicateNode(CustomLinkedList head){
      var set=new HashSet<Integer>();
      CustomLinkedList curr=head;
      CustomLinkedList prev=null;

        while (curr!=null){
            int data =curr.data;
            if (set.contains(data)){
                   prev.next=curr.next;
            }else{
                  set.add(data);
                  prev=curr;
            }
            curr=curr.next;
        }

      return  head;
    }
    public static void main(String[] args) {
        CustomLinkedList node= new CustomLinkedList(12);
        node.appendDataAtEnd(13);
        node.appendDataAtEnd(14);
        node.appendDataAtEnd(15);
        node.appendDataAtEnd(15);
        node.appendDataAtEnd(16);
        node.appendDataAtEnd(17);
        CustomLinkedList node1= node.deleteNode(node,12);
        CustomLinkedList node2= node.removeDuplicateNode(node);
        while (node2.next!=null){
            System.out.println(node2.data);
            node2=node2.next;
        }
        System.out.println(node2.data);
    }

}
