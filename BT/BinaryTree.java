package BT;
public class BinaryTree {
    Object root;
    BinaryTree left;
    BinaryTree right;
    public BinaryTree(Object root){
        this.root=root;
    }
    public BinaryTree(Object root,BinaryTree left,BinaryTree right){
        this.root=root;
        this.left=left;
        this.right=right;
    }

    public Object getRoot(){
        return root;
    }
    public BinaryTree getLeft(){
        return  left;
    }
    public  BinaryTree getRight(){
        return right;
    }

    boolean isLeaf(){
        return  left==null&& right ==null;
    }


    public String toString() {
        StringBuffer buf = new StringBuffer();
        if(left!=null)buf.append(left.toString()+" ");
        buf.append(root);
        if(right!=null)buf.append(right.toString()+" ");
        return buf+" ";
    }
    public String preOrder() {
        StringBuffer buf = new StringBuffer();
        buf.append(root);
        if(left!=null)buf.append(left.toString()+" ");
        if(right!=null)buf.append(right.toString()+" ");
        return buf+" ";
    }
    public String postOrder() {
        StringBuffer buf = new StringBuffer();
        if(left!=null)buf.append(left.toString()+" ");
        if(right!=null)buf.append(right.toString()+" ");
        buf.append(root);
        return buf+" ";
    }

    //H.W
    public int size(){
       // return 1+(left!=null?left.size():0)+(right!=null?right.size():0);
        if(left==null&&right ==null)return 1;
        if(left==null)return 1+ right.size();
        if(right==null)return 1+ left.size();
        return 1+left.size()+ right.size();
    }
    public int height(){
//        return Math.max(left.size(),right.size())-1;
        if(root==null)return -1;
        int leftc=0; int rightc=0;

        if(left!=null)leftc=1+left.height();
        if(right!=null)rightc=1+right.height();
        return  leftc>rightc?leftc:rightc;
    }
    public boolean search(Object data){
        String flag=toString();
        return flag.contains(data.toString());
    }
    public boolean isFull(){
        return size()==(int)Math.pow(2,height()+1)-1;
    }
}
