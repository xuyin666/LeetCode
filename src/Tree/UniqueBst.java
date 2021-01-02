package Tree;

// Given n, how many structurally unique BST's (binary search trees) that store values 1 ... n?


// G(n) : the number of uniques Trees
// F(i, n) : the number i as the root in the n sequences
// G(n) = F(1,n) + F(2,n) +...+ F(n,n)
// F(i, n) = G(i-1) * G(n-i)
// G(0)=1, G(1)=1
public class UniqueBst {
//    iterative
//    public int numTrees(int n) {
//        int[] arr = new int[n+1];
//        arr[0] = 1;
//        arr[1] = 1;
//        for(int i=2; i<n+1; i++){
//            for(int j=1; j<=i; j++){
//                arr[i] = arr[i] +printF(arr, j, i);
//            }
//        }
//        return arr[n];
//    }
//
//    public int printF(int[] arr, int i, int n){
//        return arr[i-1]*arr[n-i];
//    }
    public int numTrees(int n) {
        if(n==0 || n==1)
            return 1;
        else{
            int sum = 0;
            for(int i=1; i<=n; i++){
                sum = sum + printF(i, n);
            }
            return sum;
        }
    }

    public int printF(int i, int n){
        return numTrees(i-1)*numTrees(n-i);
    }

    public static void main(String[] args){
        UniqueBst u =new UniqueBst();
        System.out.println(u.numTrees(3));

    }
}
