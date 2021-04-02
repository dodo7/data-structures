package Hashing;

import LinkList.LinkedList;

public class ChainingHashing {

    private int hashtablesize;
    private LinkedList hashtable[];

    public ChainingHashing(){
        hashtablesize=10;
        hashtable=new LinkedList[hashtablesize];
        for(int i=0;i<hashtablesize;i++){
            hashtable[i]=new LinkedList();
        }
    }
    public int hashcode(int key){
        return key % hashtablesize;
    }

    public void insert(int element){
        int i=hashcode(element);
        hashtable[i].insertSorted(element);
    }

    public boolean search(int key){
        int i=hashcode(key);
       return hashtable[i].searchElement(key)!=-1;

    }

    public void display(){
        for(int i=0;i<hashtablesize;i++){
            System.out.println("["+i+"]");
            hashtable[i].display();
        }
        System.out.println();
    }
}
