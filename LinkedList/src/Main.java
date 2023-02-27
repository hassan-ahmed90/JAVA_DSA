

//you have to enter the 10 elements in the linked list, and then you have to print out them using for loop
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
}
public class Main {
    public static void main(String[] args) {
        Node start;
        Node p=start=new Node(11);
        for(int i=2;i<11;i++){
            p.next=new Node(i*11);
            p=p.next;
        }
        int count =0;
        for( p=start;p!=null;p=p.next) {
            System.out.println(p.data);
            count++;
        }
        System.out.println("This is the counter ");
        System.out.println(count);

    }
}
