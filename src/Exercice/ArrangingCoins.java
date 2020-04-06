package Exercice;

public class ArrangingCoins {
    public int arrangeCoins(int n) {
        /*int i=1;
        int sum=1;
        while(sum <= n){
            i++;
            sum=i+sum;
        }
        return i-1;*/

        return (int)((Math.sqrt(8.0*n+1)-1)/2);


    }
}
