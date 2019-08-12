package com.company.challenges;

import java.io.*;
import java.time.LocalDate;

public class java_date_and_time {

    public static String findDay(int month, int day, int year) {

        return LocalDate.of(year, month, day).getDayOfWeek().name();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = findDay(month, day, year);
        System.out.println(res);
    }
}

