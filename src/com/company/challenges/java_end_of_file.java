package com.company.challenges;
import java.io.*;
import java.util.*;

public class java_end_of_file {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int i = 1;

        while(scan.hasNext()){
            String a = scan.nextLine();
            System.out.println(i+" "+a);
            i++;
        }
    }

}
