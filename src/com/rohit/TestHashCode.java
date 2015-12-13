package com.rohit;

import java.util.HashMap;

/**
 * Created by PPP on 1/25/2015.
 */
class Testing {
    public static void testOverride() {
        System.out.println("I am called");
    }



}


public class TestHashCode extends Testing {
/*    public static void testOverride() {
        System.out.println("No no I am called");
    }*/

    public static void main(String[] args) {
        testOverride();
        HashMap<MyModal, Integer> hashMap = new HashMap<>();

        MyModal modal1 = new MyModal(1, "a");
        MyModal modal2 = new MyModal(2, "b");

        hashMap.put(modal1, 1);
        hashMap.put(modal2, 2);

        System.out.println(hashMap.get(modal2));

        System.out.println("Size is" + hashMap.size());
        System.out.println(modal1.hashCode() + " "+modal2.hashCode());
    }

}