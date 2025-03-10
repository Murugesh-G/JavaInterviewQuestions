package com.mgjava.gc;

import java.lang.ref.SoftReference;

public class SoftReferenceExample {
    public static void main(String[] args) {
        SoftReference<Object> softReference = new SoftReference<>(new Object());
        System.out.println("Before GC:" + softReference);
        System.gc(); // Request Garbage Collection
        System.out.println("After GC:" + softReference);// Usually not null, unless memory is low
    }
}
