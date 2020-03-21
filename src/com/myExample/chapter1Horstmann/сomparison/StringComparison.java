package com.myExample.chapter1Horstmann.сomparison;

public class StringComparison {
   /* Section 1.5.3, “String Comparison” (page 25) has an example of two strings
    s and t so that s.equals(t) but s != t. Come up with a different example
    that doesn’t use substring).*/

    public  void comparison() {
        String str1 = "Home";
        String str2 = new String("Home");
        System.out.println(str1 + "  " + str2);
        System.out.println(str1 == str2); //false
        System.out.println(str1.equals(str2)); //true

        System.out.println(str1 == str2.intern()); //true
    }
}
