package BinnaryTree;

import Linked_List1.ListNode;

import java.util.LinkedList;
import java.util.Queue;

public class LevelWiseTra {
    public static void main(String[] args) {
        Queue<Node>q=new LinkedList<>();
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.left=b;
        a.right =c;
        b.left=d;
        b.right=e;
        q.add(a);
        while(!q.isEmpty()){
            Node temp=q.remove();
            System.out.print(temp.val+" ");
            if(temp.left!=null)q.add(temp.left);
            if(temp.right!=null)q.add(temp.right);
        }
        }
    }

