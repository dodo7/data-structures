package Recursion;

public class TreeRecursion {

    public void calculate(int n){
        if(n>0){
            calculate(n-1);
            int k=n*n;
            System.out.println(k);
            calculate(n-1);
        }
    }

    public static void main(String[] args) {
        TreeRecursion r=new TreeRecursion();
        r.calculate(3);
    }
}
