package Algorithm;

public class BinarySearch {

    public int binarySearch(int A[], int n, int key) {
        int l = 0;
        int r = A.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (key == A[mid]) {
                return mid;
            } else if (key > A[mid]) {
                l = mid + 1;
            } else if (key < A[mid]) {
                r = mid - 1;
            }
        }
        return -1;
    }

    public int binaryRecursiveSearch(int A[],int key,int l,int r){
        if(l>r) {
            return 0;
        }
        int m=(l+r)/2;
        if(key==A[m]) {
            return m;
        }
        else if(key<A[m]) {
            return binaryRecursiveSearch(A, key, l, r - 1);
        }
        else if(key>A[m])
            return binaryRecursiveSearch(A,key,l+1,r);

        return -1;

    }

    public static void main(String[] args) {
        BinarySearch b=new BinarySearch();
        int A[]={1,2,3,4,5,6};
       int found= b.binarySearch(A,A.length, 1);
        System.out.println(found);
        System.out.println("========================");

        int found2=b.binaryRecursiveSearch(A,1,0,A.length-1);
        System.out.println(found2);

    }}