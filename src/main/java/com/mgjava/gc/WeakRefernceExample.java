package com.mgjava.gc;

import java.lang.ref.WeakReference;

public class WeakRefernceExample {
    public static void main(String[] args) {
        // Creating a weak reference to a Data object
        WeakReference<Data> weakRef = new WeakReference<>(new Data("Weak Object"));
        // Checking if the object is still accessible
        System.out.println("Before GC: " + weakRef.get());// Output: Weak Object
        // Suggesting GC to run
        System.gc();
        // Checking after GC
        System.out.println("After GC: " + weakRef.get());// Output: null (most likely)
    }

}

class Data {
    String name;

    Data(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

