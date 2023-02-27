public class Main2 {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next= null;
        }
    }
    Node head;
    void buildList(int data){
        Node p = new Node(data);
        if(head== null){
            head=p;
        }
        else {
            p.next= head;
            head=p;
        }
    }
    void displayList(){
        Node p=head;
        if(head== null){
            System.out.println("your linkedlist is empty");
        }else{
            while (p!=null){
                System.out.println(p.data);
                p=p.next;
            }
        }
    }
    void printLastList(Node p1){

        while (p1.next!=null){
            p1 = p1.next;
        }
        System.out.println("This is the last of the list"+p1.data);
    }

    void printMid(Node p2){
        int mid = size(p2)/2;
        for(int i =0;i<mid-1;i++){
            p2=p2.next;
        }
        System.out.println("This is the Mid of the list "+p2.data);
    }
    int size(Node head){
        int counter =0 ;
        for(Node i = head;i!=null;i=i.next){
            counter++;
        }
        return  counter;
    }
    public static void main(String[] args) {

        Main2 mylist = new Main2();
        mylist.buildList(29);
        mylist.buildList(35);
        mylist.buildList(45);
        mylist.buildList(55);
        mylist.buildList(65);
        mylist.buildList(75);
        mylist.buildList(95);
        mylist.displayList();
        mylist.printLastList(mylist.head);
        mylist.printMid(mylist.head);
    }
}
