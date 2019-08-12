package com.company.challenges;

import java.util.Scanner;

public class java_loops_i {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int n = 1; n<11; n++){
            System.out.println(N+" x "+n +" = "+N*n);
        }
        scanner.close();
    }


}
