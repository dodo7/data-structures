package Heaps;

public class Heaps {

    private int data[];
    private int maxsize;
    private int csize;

    public Heaps(){
        maxsize=10;
        data=new int[maxsize];
        csize=0;
        for(int i=0;i<data.length;i++){
            data[i]=-1;
        }
    }

    public int length(){
        return csize;
    }

    public boolean isEmpty(){
        return csize==0;
    }
    public void insert(int e){
        if(csize==maxsize){
            return;
        }
        csize=csize+1;
        int hi=csize;
        while (hi>1 && e>data[hi/2]){
            data[hi]=data[hi/2];
            hi=hi/2;
        }
        data[hi]=e;
    }

    public int max(){
        if(isEmpty()){
            return -1;
        }
        return data[1];
    }

    public void display(){
        for (int i=0;i<data.length;i++){
            System.out.println(data[i]+" ");
        }
    }

    public int deleteMax(){
        if(isEmpty()){
            return -1;
        }
        int e=data[1];
        data[1]=data[csize];
        data[csize]=-1;
        csize=csize-1;
        int i=1;
        int j=i*2;
        while (j<=csize){
            if(data[j]<data[j+1])
                j=j+1;
            if(data[i]<data[j]){
                int temp=data[i];
                data[i]=data[j];
                data[j]=temp;
                i=j;
                j=i*2;
            }else
                break;
        }
        return e;
    }
}
