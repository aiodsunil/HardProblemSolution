package org.aiods;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

public class CheckIfAllLeavesareatsamelevel {
    public static void main(String[] args) {

            Node root = new Node(1);
       root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
    //    root.right.right = new Node(7);

        System.out.println(check(root));


    }


    static boolean check(Node root) {
        if (root==null){
           return true;
        }
        int level=0;
        int leafLevel=-1;

        Queue<Node> queue= new LinkedList<>();
          queue.add(root);


        while (!queue.isEmpty()){
            int size=queue.size();
               for (int i=0;i<size;i++){
                    Node currentNode=queue.poll();

                    if (currentNode.left==null && currentNode.right==null){
                        if (leafLevel==-1){
                            leafLevel=level;
                        }else{
                            if (leafLevel!=level){
                                return  false;
                            }

                        }
                    }
                    if (currentNode.left!=null) queue.add(currentNode.left);
                    if (currentNode.right!=null) queue.add(currentNode.right);
               }

            level++;
        }
       return  true;
    }
}
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
