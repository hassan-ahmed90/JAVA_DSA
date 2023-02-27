package queue;

public class ArrayQueue {
    private Object[] a;
    private int size;
    public ArrayQueue(int capacity){
        if(capacity<1)throw new IllegalStateException("capacity should be greater than 0");
        a=new Object[capacity];
    }
    private void resize(){
        Object[] aa=a;
        a=new Object[size*2];
        System.arraycopy(aa,0,a,0,size);
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void add(Object data){
        if(size==a.length)resize();
        a[size++]=data;
    }
    public Object remove(){
        if(isEmpty())throw new IllegalStateException("Queue is empty");
        Object data=a[0];
        System.arraycopy(a,1,a,0,--size);
        return data;

    }
    public Object first(){
        if (isEmpty())throw new IllegalStateException("Queue is empty");
        return a[0];
    }
    public int size(){
        return size;
    }

    public static void main(String[] args) {
        ArrayQueue queue=new ArrayQueue(10);
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println(queue.remove());
    }
}
