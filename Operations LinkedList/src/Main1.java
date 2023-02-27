
// Create two linkedlist / and array and find the sum and highest among them
class Node1{
    int data;
    Node1 next;
    Node1(int s){
        this.data=s;
    }

}
class MyNewMethods{
    void arraySum(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println("THis is the arrau sum "+sum);
    }
    void arrayHighest(int a[]){
        int highest=a[0];
        for(int i=1;i<a.length;i++){
            if(highest<a[i]){
                highest=a[i];
            }
        }
        System.out.println("THis is the arrayhighest "+highest);
    }
    void linkedHighest(Node1 s){
        int highest=s.data;
        for(Node1 n=s.next;n!=null;n=n.next){
            if(highest<n.data){
                highest=n.data;
            }
        }
        System.out.println("This is the highest linkedlist "+highest);
    }
    void sumLinked(Node1 g){
        int sum=0;
        for(Node1 j=g;j!=null;j=j.next){
            sum+=j.data;
        }
        System.out.println("This is tthe sum of the linkedlist "+sum);
    }
}

class PracticeTest {
    public static void main(String[] args) {
        int arr1[]={5,7,9,11};
        int arr2[]={29,35,45};
        Node1 h=new Node1(5);
        h.next=new Node1(7);
        h.next.next=new Node1(9);
        h.next.next.next=new Node1(11);
        Node1 f=new Node1(29);
        f.next=new Node1(35);
        f.next.next=new Node1(45);
        MyNewMethods m=new MyNewMethods();
        m.arrayHighest(arr1);
        m.arrayHighest(arr2);
        m.arraySum(arr1);
        m.arraySum(arr2);
        m.linkedHighest(f);
        m.linkedHighest(h);
        m.sumLinked(f);
        m.sumLinked(h);
    }}
