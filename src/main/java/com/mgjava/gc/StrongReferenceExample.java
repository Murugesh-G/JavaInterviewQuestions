package com.mgjava.gc;

public class StrongReferenceExample {
    public static void main(String[] args) {
        Object obj = new Object();  // Strong reference
        System.out.println(obj);  // Output: java.lang.Object@xxxx

        obj = null;  // Now eligible for Garbage Collection
        System.gc();  // Hinting GC to run
    }
}
