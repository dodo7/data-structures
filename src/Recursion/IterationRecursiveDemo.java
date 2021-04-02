package Recursion;

public class IterationRecursiveDemo {

    public void calculateiterative(int n){
        while(n>0){
            int k=n*n;
            System.out.println(k);
            n=n-1;
        }
    }

    public void calculaterecursive(int n){
        if(n>0){
            int k=n*n;
            System.out.println(k);
            calculateiterative(n-1);
        }
    }

    public static void main(String[] args) {
        IterationRecursiveDemo recursiveDemo=new IterationRecursiveDemo();
        recursiveDemo.calculateiterative(4);
        recursiveDemo.calculaterecursive(4);
    }
}
