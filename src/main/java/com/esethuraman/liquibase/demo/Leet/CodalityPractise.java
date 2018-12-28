package com.esethuraman.liquibase.demo.Leet;

import java.util.Arrays;

public class CodalityPractise {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int i;
        int missingNumber = 1;
        int previous = 1;
        if(A.length > 0){
            previous = A[0];
        }

        for(i=0; i<A.length; i++){
            if(A[i] > 0){
                break;
            }
            previous = A[i];
        }

        for(; i<A.length; i++){
            if((A[i] - previous) > 1 ){
                missingNumber = A[i]-1;;
                break;
            }
            missingNumber = -1;
            previous = A[i];

        }
        if(missingNumber == -1){
            missingNumber = A[i-1]+1;
        }
        System.out.println("Missing number => "+missingNumber);
        return missingNumber;
    }

    public static void main(String[] args) {
        CodalityPractise obj = new CodalityPractise();
        obj.solution(new int[]{-1,-3});
        obj.solution(new int[]{1,2,3});
        obj.solution(new int[]{90, 91,92,92,93});
        obj.solution(new int[]{90, 91,92,92,94});
    }
}
