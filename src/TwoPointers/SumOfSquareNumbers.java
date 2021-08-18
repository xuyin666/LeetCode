package TwoPointers;

// Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.

public class SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {
        if (c == 0) return true;
        int i = 0;
        int j = (int) Math.sqrt(c);
        while(i <= j) {
            int sum = i * i + j * j;
            if( sum == c)
                return true;
            else if ( sum < c )
                i++;
            else
                j--;
        }
        return false;
    }
}
