package BinarySearchTree;


import Queue.LinkedListQueue;

public class BinarySearchTree {

    class Node {

        int element;
        Node left;
        Node right;

        public Node(int e, Node l, Node r) {
            element = e;
            left = l;
            right = r;
        }
    }

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(Node temproot, int e) {
        Node temp = null;
        while (temproot != null) {
            temp = temproot;
            if (e == temproot.element)
                return;

            else if (e < temproot.element)
                temproot = temproot.left;

            else if (e < temproot.element)
                temproot = temproot.right;
        }
        Node n = new Node(e, null, null);
        if (root != null) {
            if (e < temp.element)
                temp.left = n;

            else if
                (e > temp.element)

            temp.right = n;
        }
        else root = n;
    }

    public void inorder(Node temproot) {
        if (temproot != null) {
            inorder(temproot.left);
            System.out.println(temproot.element);
            inorder(temproot.right);
        }
    }

    public Node rinsert(Node temproot, int e) {
        if (temproot != null) {
            if (e < temproot.element)
                temproot.left = rinsert(temproot.left, e);
            else if (e > temproot.element)
                temproot.right = rinsert(temproot.right, e);

        } else {
            Node n = new Node(e, null, null);
            temproot = n;
        }
        return temproot;
    }

    public void preorder(Node temproot){
        if(temproot!=null){
            System.out.println(temproot.element);
            preorder(temproot.left);
            preorder(temproot.right);
        }
    }
    public void postorder(Node temproot){
        if(temproot!=null){
            postorder(temproot.left);
            postorder(temproot.right);
            System.out.println(temproot.element);
        }
    }

    public void levelorder(){
        LinkedListQueue q=new LinkedListQueue();
        Node t=root;
        System.out.println(t.element+" ");
        q.enqueue(t);
        while (!q.isEmpty()){
            t=(Node)q.dequeue();
            if(t.left!=null){
                System.out.println(t.left.element);
                q.enqueue(t.left);
            }
            if(t.right!=null){
                System.out.println(t.right.element);
                q.enqueue(t.right);
            }
        }

    }

    public boolean search(int key){
        Node temproot=root;
        while (temproot!=null){
            if(key==temproot.element)
                return true;
            else if(key<temproot.element)
                temproot=temproot.left;
            else if(key>temproot.element)
                temproot=temproot.right;
        }
        return false;
    }
    public boolean rsearch(Node temproot,int key){
        if(temproot!=null){
            if(key==temproot.element)
                return true;
            else if(key<temproot.element)
                return rsearch(temproot.left,key);
            else if(key>temproot.element)
                return rsearch(temproot.right,key);

        }
        return false;
    }
    public boolean delete(int e){
        Node p=root;
        Node pp=null;
        while (p!=null && p.element !=e){
            pp=p;
            if(e<p.element)
                p=p.left;
            else
                p=p.right;
        }
        if(p==null)
            return false;
        if(p.left!=null && p.right!=null){
            Node s=p.left;
            Node ps=p;
            while (s.right!=null){
                ps=s;
                s=s.right;
            }
            p.element=s.element;
            p=s;
            pp=ps;
        }

        Node c=null;
        if(p.left!=null)
            c=p.left;
        else c=p.right;
        if(p==root)
            root=null;
        else
            if(p==pp.left)
                pp.left=c;
            else
                pp.right=c;
            return true;
    }

    public int count(Node temproot){
        if(temproot!=null){
            int x=count(temproot.left);
            int y=count(temproot.right);
            return x+y+1;
        }
        return 0;
    }

    public int height(Node temproot){
        if(temproot!=null){
            int x=height(temproot.left);
            int y=height(temproot.right);
            if(x>=y)
                return x+1;
            else
                return y+1;

        }
        return 0;
    }
}
