package com.mgjava.gc;

import java.lang.ref.WeakReference;

public class WeakRefernceExample {
    public static void main(String[] args) {
        WeakReference<Data> weakRef = new WeakReference<>(new Data("Weak Object"));
        System.out.println("Before GC: " + weakRef.get());
        System.gc();
        System.out.println("After GC: " + weakRef.get());
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

