package LinkList;

import com.sun.deploy.security.SelectableSecurityManager;

public class LinkedList {

    class Node{
        int element;
        Node next;

        public Node(int e,Node n){
            element=e;
            next=n;
        }

    }
    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){
        head=null;
        tail=null;
        size=0;
    }

    public int length(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void addLast(int e){
        Node newest=new Node(e,null);

        if (isEmpty())
            head=newest;
        else
            tail.next=newest;

        tail=newest;
        size=size+1;

    }

    public void addFirst(int e){
        Node newest=new Node(e,null);
        if(isEmpty()) {
            head = newest;
            tail = newest;
        }
        else{
            newest.next=head;
            head=newest;
        }
        size=size+1;
    }

    public void addAnny(int e,int position){
        if(position<=0 || position>=size){
            System.out.println("Invalid position");
            return;
        }
        Node newest=new Node(e,null);
        Node p=head;
        int i=1;
        while (i<position-1) {
            p = p.next;
            i = i + 1;
        }
        newest.next=p.next;
        p.next=newest;
        size=size+1;
        }
    public int removeFirst(){
        if(isEmpty()){
            System.out.println("False");
            return -1;
        }
        int e=head.element;
        head=head.next;
        size=size-1;
        if(isEmpty())
            tail=null;
        return e;
    }

    public int removeLast(){
        if(isEmpty()){
            System.out.println("List is emtpty");
            return -1;
        }
        Node p=head;
        int i=1;
        while (i<length()-1){
            p=p.next;
            i=i+1;
        }
        tail=p;
        p=p.next;
        int e=p.element;
        tail.next=null;
        size=size-1;
        return e;
    }

    public int removeAny(int position){
        if(position<=0 || position>=size-1){
            System.out.println("Invalid position");
            return -1;
        }
        Node p=head;
        int i=1;
        while (i<position-1) {
            p = p.next;
            i = i + 1;
        }
        int e=p.next.element;
        p.next=p.next.next;
        size=size-1;
        return e;
    }

    public int searchElement(int key){
        Node p=head;
        int index=0;
        while (p!=null){
            if(p.element==key){
                return index;
            }
            p=p.next;
            index=index+1;
        }
        return -1;
    }

    public void insertSorted(int e) {
        Node newest = new Node(e, null);
        if (isEmpty())
            head = newest;
        else {

            Node p = head;
            Node q = head;
            while (p != null && p.element < e) {
                q = p;
                p = p.next;
            }
            if (p == head) {
                newest.next = head;
                head = newest;
            } else {
                newest.next = q.next;
                q.next = newest;
            }
        }
        size=size+1;
    }

    public void display(){
        Node p=head;
        while (p!=null){
            System.out.println(p.element+ " -->");
            p=p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.addLast(7);
        l.addLast(4);
        l.addLast(12);
        l.display();
        System.out.println(l.size);
        l.addLast(8);
        l.addLast(3);
        l.display();
        System.out.println(l.size);
    }

}
