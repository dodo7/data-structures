package Queue;

public class LinkedListQueue {

        class Node{
            Object element;
            Node next;

            public Node(Object e, Node n){
                element=e;
                next=n;
            }
        }

        private Node front;
        private Node rear;
        private int size;

        public LinkedListQueue(){
            front =null;
            rear=null;
            size=0;
        }

        public int length(){
            return size;
        }

        public boolean isEmpty(){
            return size==0;
        }



        public void enqueue(Object e){
            Node newest=new Node(e,null);
            if(isEmpty()){
                System.out.println("Is Empty");
                front =newest;
            }
            else{
                rear.next= newest;
                rear=newest;
            }
            size=size+1;
        }

        public Object dequeue(){
            if(isEmpty()){
                System.out.println("Is Empty");
                return -1;
            }
            Object e= front.element;
            front = front.next;
            size=size-1;
            if(isEmpty()){
                rear=null;
            }
            return e;
        }

        public void display(){
          Node p= front;
            while (p!=null){
                System.out.println(p.element);
                System.out.println("--->");
                p=p.next;
            }
        }
    }


