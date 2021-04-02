package Stacks;

public class StacksArray {

    private int data[];
    private int top;

    public StacksArray(int n){
        data=new int[n];
        top=0;
    }
    public int length(){
        return top;
    }

    public boolean isEmpty(){
        return top==0;
    }

    public boolean isFull(){
        return top==data.length;
    }
    public void push(int e){
        if(isFull()){
            System.out.println("Is full");
            return;
        }
        else {
            data[top]=e;
            top=top+1;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Is Empty");
            return -1;
        }
        int e=data[top-1];
        top=top-1;
        return e;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Is Empty");
            return -1;
        }
        return data[top-1];
    }

    public void display(){
        for(int i=0;i<top;i++){
            System.out.println(data[i]);
        }
    }
}
