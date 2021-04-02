package Recursion;

public class HeadReacursionDemo {

    public void calculate(int n){
        if(n>0){
            calculate(n-1);
            int k=n*n;
            System.out.println(k);
        }
    }

    public static void main(String[] args) {
        HeadReacursionDemo r=new HeadReacursionDemo();
        r.calculate(4);
    }
}

