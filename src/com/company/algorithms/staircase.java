package com.company.algorithms;

import java.util.Scanner;

public class staircase {

    // Complete the staircase function below.
    static void staircase(int n) {

        for(int i = 0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i+j>= n-1) System.out.print("#");
                    // if(i>=j) System.out.print("#");
                else System.out.print(" ");
            }
            if(i!=(n-1))System.out.println();
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }

}
