package com.mgjava.gc;

import java.util.WeakHashMap;

// Using WeakHashMap for Automatic Cache Cleanup
public class WeakHashMapExample {
    public static void main(String[] args) {
        WeakHashMap<Object, String> weakMap = new WeakHashMap<>();
        Object obj1 = new Object();
        Object obj2 = new Object();

        weakMap.put(obj1, "Persistent");
        weakMap.put(obj2, "Temporary");

        System.out.println("Before GC: " + weakMap);

        obj2 = null;// Removing strong reference to key2
        System.gc();// Hinting JVM to run GC

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("After GC: " + weakMap);// key2 entry is removed

    }
}

/*
Output:
Before GC: {java.lang.Object@7b23ec81=Persistent, java.lang.Object@6acbcfc0=Temporary}
After GC: {java.lang.Object@7b23ec81=Persistent}
*/
