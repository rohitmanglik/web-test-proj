package com.rohit.onlineTests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by PPP on 2/5/2015.
 */
public class UrbanLadder {
    private static final String[] lowNames = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    private static final String[] tensNames = {
            "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    private static final String[] bigNames = {
            "thousand", "million", "billion"};

    public static String convertNumberToWords (long n) {
        if (n < 0) {
            return "minus " + convertNumberToWords(-n); }
        if (n <= 999) {
            return convert999(n); }
        String s = null;
        int t = 0;
        while (n > 0) {
            if (n % 1000 != 0) {
                String s2 = convert999(n % 1000);
                if (t > 0) {
                    s2 = s2 + " " + bigNames[t-1]; }
                if (s == null) {
                    s = s2; }
                else {
                    s = s2 + " " + s; }}
            n /= 1000;
            t++; }
        return s; }

    // Range 0 to 999.
    private static String convert999 (long n) {
        String s1 = lowNames[(int)n / 100] + " hundred";
        String s2 = convert99(n % 100);
        if (n <= 99) {
            return s2; }
        else if (n % 100 == 0) {
            return s1; }
        else {
            return s1 + " and " + s2; }}

    // Range 0 to 99.
    private static String convert99 (long n) {
        if (n < 20) {
            return lowNames[(int)n]; }
        String s = tensNames[(int)n / 10 - 2];
        if (n % 10 == 0) {
            return s; }
        return s + " " + lowNames[(int)n % 10]; }

    public static int solution(int[] A) {
        return 1;
    }


    public static void main(String[] args) throws Exception {
        int time = 24*3600*1000;

        time = time/1000;

        int hh = time / 3600;
        int mm = (time %3600)/60;
        int ss = time % 60;

/*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        long N = Long.parseLong(line);
        if(N==0)
            System.out.println("zero");
*/

        System.out.println(convertNumberToWords(time));
    }
}
