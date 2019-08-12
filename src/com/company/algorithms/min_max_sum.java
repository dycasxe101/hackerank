package com.company.algorithms;

import java.util.Scanner;

public class min_max_sum {


    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        long min = 999999999, max = 0, temp =0, sum = 0;
        for(int i=0; i<arr.length; i++){
            if(min > arr[i])
                min = arr[i];
            if(max<arr[i])
                max = arr[i];

            sum = sum + arr[i];

        }
        long maxs = sum - min;
        long mins = sum - max;
        System.out.println(mins+" "+ maxs);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }


}
