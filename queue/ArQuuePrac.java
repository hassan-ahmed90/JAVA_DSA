package queue;

public class ArQuuePrac {

    ArQuuePrac(int cap){
        a=new Object[cap];
    }

    private Object []a;
    private int size;

    private void resize(){
        Object[] aa=a;
        a= new Object[size*2];
        System.arraycopy(aa,0,a,0,size);
    }
    public boolean isEmptyy(){
        return size==0;
    }

    void addQueue(Object data){
        if(size==a.length)resize();
        a[size++]=data;
    }
    Object deQueue(){
        if(isEmptyy())throw new IllegalStateException("Khali ha bhai");
        Object data=a[0];
        System.arraycopy(a,1,a,0,--size);
        size--;
        return data;
    }

    Object firssr(){
        if(isEmptyy()) throw new IllegalStateException("Jaga hi Jaga ha ");
        return a[0];
    }

    public static void main(String[] args) {

        ArQuuePrac que= new ArQuuePrac(4);
        que.addQueue("Shani");
        que.addQueue("Love");
        que.addQueue("Hassan");
        System.out.println(que.deQueue());

    }
}
