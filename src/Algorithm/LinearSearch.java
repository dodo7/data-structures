package Algorithm;

public class LinearSearch {

    public int linearSearchint (int A[],int n,int k){
        int index=0;
        while(index<n){
            if(A[index]==k)
                return index;
                index++;
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearch l=new LinearSearch();
        int A[]={81,24,47,96,15};
        int found=l.linearSearchint(A, A.length, 15);
        System.out.println(found);
    }
}
