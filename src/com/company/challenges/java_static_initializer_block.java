package com.company.challenges;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class java_static_initializer_block {

    static Scanner in;
    static int B;
    static int H;
    static boolean flag=true;
    static{
        in=new Scanner(System.in);
        B = in.nextInt();
        H = in.nextInt();

        if(B>0 && H>0) {
            flag = true;
        }
        else{
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}

