package org.ccsunnyfd.design;

/**
 * Demo
 *
 * @version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            EnumSingleton singleton = EnumSingleton.INSTANCE;
            System.out.println("singleton: " + System.identityHashCode(singleton) + "\tid: " + singleton.getId());
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            EnumSingleton singleton = EnumSingleton.INSTANCE;
            System.out.println("singleton: " + System.identityHashCode(singleton) + "\tid: " + singleton.getId());
        }
    }
}
