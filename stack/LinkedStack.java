package stack;
public class LinkedStack {
    private static class Node{
        private Object data;
        private Node next;
        public Node(Object data){
            this.data=data;
        }
    }
    private int size;
    public boolean isEmpty(){
        return size==0;
    }
    private Node top;
    public void push(Object data){
        Node n=new Node(data);
        n.next=top;
        top=n;
        size++;

    }
    public Object peek(){
        return top.data;}
    public Object pop(){
        Object data=top.data;
        top=top.next;
        size--;
        return data;
    }
    public int size(){
        return size;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}