package queue;

public class PracQueue {

    private static class  Node{
        Object data;
        Node next=this;
        Node previous=this;
        Node(Object data){
            this.data=data;
        }
        Node(Object data, Node next, Node previous){
            this.data=data;
            this.next=next;
            this.previous=previous;
        }
    }
    private Node head=new Node(null);
    private  int size;

    public boolean isKhali(){
        return size==0;
    }
    public int sIZE(){
        return size;
    }
    public void equeue(Object data){
        head.previous.next= new Node(data,head,head.previous);
        head.previous=head.previous.next;
        size++;
    }

    public Object dequeue(){
        if (isKhali())throw new IllegalStateException("Khali ha queue");
        Object data= head.next.data;
        head.next=head.next.next;
        head.previous.next=head;
         size--;
         return data;
    }
    public Object first(){
        if(isKhali())throw new IllegalStateException("Khali aa bhaa");
        return head.next.data;
    }

    public void display(){
        for(Node n=head.next;n!=head;n=n.next) System.out.print(n.data+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        PracQueue q = new PracQueue();
        q.equeue("Hassan ");
        q.equeue("Ahmed");
        q.equeue("Rajput");
        q.dequeue();
        System.out.println(q.size);
        System.out.println(q.isKhali());
        q.display();
    }


}
