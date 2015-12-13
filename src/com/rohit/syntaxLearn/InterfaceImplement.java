package com.rohit.syntaxLearn;

/**
 * Created by Rohit on 10/26/2015.
 */
public class InterfaceImplement implements interface1 {
    static int a;
    //private InterfaceImplement() {}

    public static InterfaceImplement factoryTest(int b) {
        a = interface1.a;
        //this.a = b;


        return new InterfaceImplement();
    }
}
