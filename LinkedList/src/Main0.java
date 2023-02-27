import java.util.Scanner;

// Creating and traversing of a list through user Scanner class
public class Main0 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public void creatLL(){
        int data,n;
        do{
        System.out.println("Enter the data of LL");
        Scanner sc = new Scanner(System.in);
        data= sc.nextInt();
        Node p = new Node(data);
        if(head==null){
            head=p;
        }else{
            p.next=head;
            head=p;
        }
        System.out.println("DO you want to add more node so press 1");
        n=sc.nextInt();
        }
        while (n==1);}
    public  void traverseLL(){
        Node p= head;
        if(head==null){
            System.out.println("Linked List not exist");
        }
        else{
            while (p!=null){
                System.out.println(p.data);
                p=p.next;
            }
        }
    }


    public static void main(String[] args) {

        Main0 mylist = new Main0();
        mylist.creatLL();
        mylist.traverseLL();

    }
}
