package com.company;

import java.util.concurrent.locks.ReentrantLock;

public class IncrementSynchronize {
    ReentrantLock lock = new ReentrantLock();
    private int value = 0;
    private Object lock1 = new Object();

    public synchronized int getNextValue1() {
        return value++;
    }

    public int getNextValue2() {
        synchronized (this) {
            return value++;
        }
    }

    public int getNextValue3() {
        synchronized (lock1) {
            return value++;
        }
    }

    public int getNextValue4() {
        lock.lock();
        try {
            value++;
        } finally {
            lock.unlock();
        }
        return value;

    }

}
