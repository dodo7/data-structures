package Recursion;

public class TailRecursionDemo {

    public void calculate(int n){
        if(n>0){
            int k=n*n;
            System.out.println(k);

            calculate(n-1);
        }
    }

    public static void main(String[] args) {
        TailRecursionDemo r=new TailRecursionDemo();
        r.calculate(4);
    }
}
