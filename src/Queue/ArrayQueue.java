package Queue;

public class ArrayQueue {

    private int data[];
    private int front;
    private int rear;
    private int size;

    public ArrayQueue(int n){
        data=new int[n];
        front=0;
        rear=0;
        size=0;
    }

    public int length(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return size==data.length;
    }

    public void enqueue(int e){
        if(isFull()){
            return;
        }
        else {
            data[rear]=e;
            rear=rear+1;
            size=size+1;
        }
    }
    public int dequeue(){
        if(isEmpty()){
            return -1;
        }
        else {
            int e=data[front];
            front=front+1;
            size=size-1;
            return e;
        }
    }
    public void display(){
        for(int i=0;i<rear;i++){
            System.out.println(data[i]);
        }
    }
}
