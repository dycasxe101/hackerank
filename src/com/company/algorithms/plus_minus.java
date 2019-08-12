package com.company.algorithms;

import java.util.Scanner;

public class plus_minus {


    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

        float sum = arr.length;
        int negatif = 0, positif = 0, zero=0;
        for(int i=0; i<sum;i++){
            if(arr[i] == 0 )zero++;
            else if(arr[i] < 0) negatif++;
            else positif++;
        }

        float n = negatif/sum;
        float p = positif/sum;
        float z = zero/sum;

        System.out.printf("%.5f\n%.5f\n%.5f", p, n, z);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }


}
