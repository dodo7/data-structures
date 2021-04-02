package Heaps;

public class HeapSortDemo {

    public void heapsort(int A[],int n){
        Heaps h=new Heaps();
        for(int i=0;i<n;i++)
            h.insert(A[i]);
            int k=n-1;
            for(int i=0;i<n;i++){
                A[k]=h.deleteMax();
                k=k-1;
            }
    }

    public void display(int A[],int n){
        for(int i=0;i<n;i++){
            System.out.println(A[i]+" ");
        }
    }
}
