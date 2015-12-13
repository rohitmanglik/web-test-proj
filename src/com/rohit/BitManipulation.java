package com.rohit;

/**
 * Created by PPP on 1/5/2015.
 */
public class BitManipulation {
    public static void main(String[] args) {
        int x= 2;
        int y = -7;
        System.out.println(x);
        int z = x|y;
        System.out.print(Integer.toBinaryString(y));

        System.out.println("Bit at location --- "+ getBit(4, 3));
        System.out.println("Set Bit at location --- "+ setBit(4, 3));
    }

    public static boolean getBit(int num, int loc){
        return (num & (1 << loc)) == num;
    }

    private static int setBit(int num, int loc) {
        return num | (1 << loc);
    }
}
