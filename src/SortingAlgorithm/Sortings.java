package SortingAlgorithm;

public class Sortings {

    public void selectionSort(int A[],int n){
        for(int i=0;i<n-1;i++){
            int position=i;
            for(int j=i+1;j<n;j++)
                if(A[j]<A[position])
                    position=j;
                    int temp=A[i];
                    A[i]=A[position];
                    A[position]=temp;
        }
    }

    public void insertionSort(int A[],int n){
        for(int i=1;i<n;i++){
            int temp=A[i];
            int position=i;
            while (position>0 && A[position-1]>temp){
                A[position]=A[position-1];
                position=position-1;
                A[position]=temp;
            }
        }
    }

    public void bubbleSort(int A[],int n){
        for(int pass=n-1;pass>=0;pass--){
           for(int i=0;i<pass;i++){
               if(A[i]>A[i+1]){
                   int temp=A[i];
                   A[i]=A[i+1];
                   A[i+1]=temp;
               }
           }
        }
    }

    public void shellSort(int A[],int n){
       int gap=n/2;
       while (gap>0){
           int i=gap;
           while (i<n){
               int temp=A[i];
               int j=i-gap;
               while (j>=0 && A[j]>temp){
                   A[j+gap]=A[j];
                   j=j-gap;
               }
               A[j+gap]=temp;
               i=i+1;
           }
           gap=gap/2;
       }
    }


    public void mergeSort(int A[],int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            mergeSort(A,left,mid);
            mergeSort(A,mid+1,right);
            merge(A,left,mid,right);
        }
    }

    public void merge(int A[],int left,int mid,int right){
        int i=left;
        int j=mid+1;
        int k=left;
        int B[]=new int[right+1];
        while (i<=mid && j<=right){
            if(A[i]<A[j]){
                B[k]=A[i];
                i=i+1;
            }
            else {
                B[k]=A[j];
                j=j+1;
            }
            k=k+1;
        }
        while (i<=mid){
            B[k]=A[i];
            i=i+1;
            k=k+1;
        }
        while (j<=right){
            B[k]=A[j];
            j=j+1;
            k=k+1;
        }
        for (int x=left;x<right+1;x++){
            A[x]=B[x];
        }
    }

    public void quickSort(int A[],int low,int high){
        if(low<high){
            int pi=partition(A,low,high);
            quickSort(A,low,pi-1);
            quickSort(A,pi+1,high);
        }
    }
        public int partition(int A[],int low,int high) {
            int pivot=A[low];
            int i=low+1;
            int j=high;
            do {
                while (i<=j&& A[i]<=pivot)
                    i=i+1;
                while (i<=j && A[j]>pivot)
                    j=j-1;
                if(i<=j)
                    swap(A,i,j);
            }  while (i<j);
            swap(A,low,j);
            return j;

        }

        public void swap(int A[],int i,int j){
            int temp=A[i];
            A[i]=A[j];
            A[j]=temp;
        }






    public void display(int A[],int n){
        for(int i=0;i<n;i++){
            System.out.println(A[i]+ " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int A[]={5,6,90,4,7,70};
        Sortings s=new Sortings();

        // s.selectionSort(A,6);
        // s.display(A,6);
        // s.insertionSort(A,6);
        // s.display(A,6);
        // s.bubbleSort(A,6);
        // s.display(A,6);
        // s.shellSort(A,6);
        // s.display(A,6);
        // s.mergeSort(A,0,5);
        // s.display(A,6);
            s.quickSort(A,0,5);
            s.display(A,6);
    }
}
