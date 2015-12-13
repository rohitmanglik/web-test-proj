package com.rohit;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by PPP on 1/3/2015.
 */
public class HashCode {
    public void learnHashCode(){




        int array[] = {2,3,4};


        Float[] f1= new Float[2];
        Float[] f2= new Float[2];
        Float f3= 12.2f;

        System.out.println(f3);

        System.out.println("Values"+f1[0]+","+f2[0]+"Is f1 == f2?"+(f1==f2));



        HashMap<String, Integer> hashMap = new HashMap();

        String str1 = new String("Rohit");
        String str2 = new String("Rohit");
        System.out.println((str1==str2));
        System.out.println((str1.hashCode()==str2.hashCode()));

        hashMap.put(str1,1);
        hashMap.put(str2,2);
        System.out.println(hashMap.get(str1));


        System.out.println("Second Run:");

        String str3 = "Rohit";
        String str4 = "Rohit";
        System.out.println((str3==str4));
        System.out.println((str3.hashCode()==str4.hashCode()));
        hashMap.put(str3,1);
        hashMap.put(str4, 2);
        System.out.println(hashMap.get(str3));
    }
}
