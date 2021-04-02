package Recursion;

public class SumNumbers {

    public int sum(int n) {
        if (n == 0)
            return 0;
            return  sum(n - 1) + n;
    }

    public int factorial(int n){
        if(n==0)
            return 1;
        return factorial(n-1)*n;
    }

    public static void main(String[] args) {
        SumNumbers s=new SumNumbers();
        System.out.println(s.sum(5));
        System.out.println(s.factorial(4));
    }
}
