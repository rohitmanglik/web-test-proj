package com.rohit.onlineTests;

/**
 * Created by PPP on 1/21/2015.
 */
public class Barclays1 {

    public static int count = 0;

    public static int recursion(int startIndex, int endIndex, int A[]) {
        int sumTillNow = 0;
        for(int i=startIndex;i<endIndex;i++) {
            sumTillNow += A[i];

            if(sumTillNow == 0) {
                count++;
                recursion(i+1, endIndex, A);
            } else if(sumTillNow<0) {
                sumTillNow=0;
            }
        }
        return count;
    }

    public static int solution(int[] A) {
        recursion(0,A.length,A);

        for(int i=0;i<A.length;i++) if(A[i]==0) count++;
        return count;
    }

    public static void main(String[] args) {
        int[] A = {2, -2, 3, 0, 4, -7};
        System.out.println(solution(A));
    }
}
