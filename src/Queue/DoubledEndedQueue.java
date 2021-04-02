package Queue;


public class DoubledEndedQueue {

        class Node{
            int element;
            Node next;

            public Node(int e, Node n){
                element=e;
                next=n;
            }

        }
        private Node front;
        private Node rear;
        private int size;

        public DoubledEndedQueue(){
            front =null;
            rear =null;
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
                front =newest;
            else
                rear.next=newest;

            rear =newest;
            size=size+1;

        }

        public void addFirst(int e){
            Node newest=new Node(e,null);
            if(isEmpty()) {
                front = newest;
                rear = newest;
            }
            else{
                newest.next= front;
                front =newest;
            }
            size=size+1;
        }


        public int removeFirst(){
            if(isEmpty()){
                System.out.println("False");
                return -1;
            }
            int e= front.element;
            front = front.next;
            size=size-1;
            if(isEmpty())
                rear =null;
            return e;
        }

        public int removeLast(){
            if(isEmpty()){
                System.out.println("List is emtpty");
                return -1;
            }
            Node p= front;
            int i=1;
            while (i<length()-1){
                p=p.next;
                i=i+1;
            }
            rear =p;
            p=p.next;
            int e=p.element;
            rear.next=null;
            size=size-1;
            return e;
        }

        public int searchElement(int key){
           Node p= front;
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

        public int first(){
            if(isEmpty()){
                return -1;
            }
            return front.element;
        }

        public int last(){
            if(isEmpty()){
                return -1;
            }
            return rear.element;
        }

        public void insertSorted(int e) {
            Node newest = new Node(e, null);
            if (isEmpty())
                front = newest;
            else {

                Node p = front;
                Node q = front;
                while (p != null && p.element < e) {
                    q = p;
                    p = p.next;
                }
                if (p == front) {
                    newest.next = front;
                    front = newest;
                } else {
                    newest.next = q.next;
                    q.next = newest;
                }
            }
            size=size+1;
        }

        public void display(){
            Node p= front;
            while (p!=null){
                System.out.println(p.element+ " -->");
                p=p.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            LinkList.LinkedList l=new LinkList.LinkedList();
            l.addLast(7);
            l.addLast(4);
            l.addLast(12);
            l.display();
            System.out.println(l.length());
            l.addLast(8);
            l.addLast(3);
            l.display();
            System.out.println(l.length());
        }

    }


