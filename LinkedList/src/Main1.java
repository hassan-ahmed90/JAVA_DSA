import java.util.Scanner;

// This is the insertion program at the begining and end and at the specific position
public class Main1 {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head= null;

    public void insertL(){
        int data,n,m,o;
        do{
            System.out.println("Enter the data of LL");
            Scanner sc = new Scanner(System.in);
            data= sc.nextInt();
          Node p = new Node(data);
            if(head==null){
                head=p;
            }else{
                System.out.println("Press 1 for beginning , 2 for At the end , 3 for specific");
                m= sc.nextInt();
                switch (m) {
                    case 1 -> {
                        p.next = head;
                        head = p;
                    }
                    case 2 -> {
                       Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = p;
                    }
                    case 3-> {
                        System.out.println("Enter the position of node to be insertion");
                        o=sc.nextInt();
                       Node temp =head;
                        for(int i=0;i<(o-1);i++){
                            temp=temp.next;
                        }
                        p.next=temp.next;
                        temp.next=p;
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

        Main1 mycreateList = new Main1();
        mycreateList.insertL();
        mycreateList.traverseL();

    }
}
