
//Create two arrays and linkedklist and find the higherst and sum among them and merger the two lists
public  class Main {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    void  mergeOfList(Node l1, Node l2){
        Node i;
        for(i = l1;i.next!=null;i=i.next){
        }
        i.next=l2;
        for (Node p2=l1;p2!=null;p2=p2.next){
            System.out.println(p2.data);
        }
    }
    void secondList(int data){
        Node q = new Node(data);
        if(head == null){
            head=q;
        }else {
            q.next=head;
            head=q;
        }
    }
    void showSecondList(){
        Node q = head;
        if(head== null){
            System.out.println("The Linkedlist is empty");
        }
        else {

            while (q!=null){
                System.out.println(q.data);
                q=q.next;
            }
        }
    }
    void createList(int data){
        Node p = new Node(data);
        if(head == null){
            head=p;
        }else {
            p.next=head;
            head=p;
        }
    }
    void showList(){
        Node p = head;
        if(head== null){
            System.out.println("The Linkedlist is empty");
        }
        else {

            while (p!=null){
                System.out.println(p.data);
                p=p.next;
            }
        }
    }

    void highestOFList(Node p1){
        int highest= p1.data;
        for(Node i=p1;i!=null;i=i.next){
            if(i.data>highest){
                highest=i.data;
            }else{

            }
        }
        System.out.println("The highest of the linkedlit is "+highest);

    }

    void sumOfList(Node n1,Node n2){
        int sum=0;
        for(Node j= n1;j!=null;j=j.next){
            sum+=j.data;
        }
        for(Node i = n2;i!=null;i=i.next){
            sum+= i.data;
        }
        System.out.println("This is the sum of LinkedList "+sum);

    }

    void arrayofSum(int [] ar1,int []ar2){

        int sum=0;
        for(int i=0;i<ar1.length;i++){
            sum+=ar1[i];
        }
        for (int j=0;j<ar2.length;j++){
            sum+=ar2[j];
        }
        System.out.println("The sum is "+sum);
    }
    void arrayHighest(int[] ar2){

        int highest =ar2[0];
        for(int i=0;i<ar2.length;i++){
            if(ar2[i]>highest){
                highest=ar2[i];
            }
        }
        System.out.println("The highest is "+highest);

    }
    public static void main(String[] args) {

        int [] array1 = {11,9,7,5};
        int [] array2 ={ 29,35,45};
     Main m = new Main();
     System.out.println("This is the first list");
        m.createList(5);
        m.createList(7);
        m.createList(9);
        m.createList(11);
        m.showList();
        Main m1 = new Main();
        System.out.println("This is the second list");
        m1.secondList(29);
        m1.secondList(35);
        m1.secondList(45);
        m1.showSecondList();
        m1.sumOfList(m.head,m1.head);
        m.highestOFList(m.head);
        m1.highestOFList(m1.head);
        m.arrayHighest(array1);
        m.arrayHighest(array2);
        m.arrayofSum(array1,array2);
        System.out.println("This is the merging of LinkedList");
        m.mergeOfList(m.head,m1.head);

    }
}