package queue;

import javax.management.openmbean.InvalidOpenTypeException;


public class LinkedQueue {
    private static class Node{
        private Object data;
        private Node next=this;
        private Node pre=this;
        public Node(Object data){
            this.data=data;
        }
        public Node(Object data,Node next,Node pre){
            this.data=data;
            this.next=next;
            this.pre=pre;
        }
    }
    private int size;
    private Node head=new Node(null);
    public boolean isEmpty(){
        return size==0;
    }
    public void add(Object data){
        head.pre.next=new Node(data,head,head.pre);
        head.pre=head.pre.next;
        size++;
    }

    public Object remove(){
        if(isEmpty())throw  new InvalidOpenTypeException("QUeue is Empty");
        Object d=head.next;
        head.next=head.next.next;
        head.next.pre=head;
        size--;
        return d;
    }

    public Object first(){
        if(isEmpty())throw new InvalidOpenTypeException("Queue is Empty");
        return head.next.data;
    }

    public int size(){
        return size;
    }
    public void display(){
        for (Node n=head.next;n!=head;n=n.next) System.out.print(n.data+" ");
        System.out.println();
    }


    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        queue.add("Saddar");
        queue.add("Taryal");
        queue.add("Goth kan");
        queue.display();
    }
}
