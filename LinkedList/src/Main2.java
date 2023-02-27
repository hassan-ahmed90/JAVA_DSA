import java.util.Scanner;


// THis is the deletion program at the end , begining , and the specific position
public class Main2 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;}
    }
    Node head= null;
    public void creatL(){
        int data,n;
        do{
            System.out.println("Enter the data of LL");
            Scanner sc = new Scanner(System.in);
            data= sc.nextInt();
            Main2.Node p = new Main2.Node(data);
            if(head==null){
                head=p;
            }else{
                p.next=head;
                head=p;
            }
            System.out.println("DO you want to add more node so press 1");
            n=sc.nextInt();
        }
        while (n==1);
    }
    public void deleteLL(){
        int n,m,o;
        Scanner sc = new Scanner(System.in);
        do{
            
            if(head==null){
                System.out.println("Your linked list empty");
            }else{
                System.out.println("Press 1 for beginning delete , 2 for At the end delete , 3 for specific");
                m= sc.nextInt();
                switch (m) {
                    case 1 -> {
                       Node temp = head;
                       temp=temp.next;
                       head=temp;
                    }
                    case 2 -> {
                       Node temp =head;
                       Node ptr= temp.next;
                       while (ptr.next!=null){
                           temp=ptr;
                           ptr=ptr.next;
                       }
                       temp.next=null;
                    }
                    case 3-> {
                        System.out.println("Enter the position of node to be deletion");
                        o=sc.nextInt();
                        Node temp =head;
                        Node ptr=temp.next;
                        for(int i=0;i<(o-2);i++){
                            temp=ptr;
                            ptr=ptr.next;
                        }
                        temp.next=ptr.next;

                    }
                    default -> System.out.println("Enter the correct coice");
                }
            }
            System.out.println("DO you want to add more node so press 1");
            n=sc.nextInt();
        }
        while (n==1);
    }
    public  void traverseL(){
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
        Main2 mydeleteList = new Main2();
        mydeleteList.creatL();
        mydeleteList.deleteLL();
        mydeleteList.traverseL();
    }
}
