

//This is the simple insertion program to insert the data into a linked list
public class Main0 {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;

    void insertData(int data){

        Node p = new Node(data);

        if(head==null){
            head=p;
        }else{
            p.next=head;
            head=p;
        }
    }
    void showSData(){
        if(head== null){
            System.out.println("Linked list dose not exist");
        }
        else {
            Node p= head;
            while (p!=null){
                System.out.println(p.data);
                p=p.next;
            }
        }
    }
    public static void main(String[] args) {

        Main0 main0 = new Main0();
        main0.insertData(11);
        main0.insertData(22);
        main0.insertData(33);
        main0.showSData();
    }
}
