package stack;
import java.util.EmptyStackException;

public class Stack {
    private class  Node{
        Object data;
        Node next;
        Node(Object data){
            this.data=data;
        }
    }
    Node top;
    int size;
    public Object pop(){
        if(isEmpty())throw new EmptyStackException();
        Object d= top.data;
        top=top.next;
        size--;
        return d;

    }
    public Object peek(){
        if(isEmpty())throw new EmptyStackException();

        return top.data;
    }
    public void push(Object data){

        Node p= new Node(data);
        p.next=top;
        top=p;
        size++;
    }
    public  int size(){
        return size;
    }
    public boolean search(Object a){
        Node temp= top;
        while (temp!=null){
            if (temp.data==a)return true;
            temp=temp.next;
        }
  return false;
    }

    public boolean isEmpty(){
        return size==0;
    }
    public void display(){
        for(Node n=top;n!=null;n=n.next) System.out.print(n.data+" ");
        System.out.println();

    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("Adil");
        stack.push("Memon");
        stack.push("Lead");
        stack.push("CR");
        stack.pop();
        stack.display();
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.search("Memon"));
//        stack.peek();
    }

}
