package com.redhat.resiliency.backend;

public class Increment {
    public String key;
    public int value;

    public Increment(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public Increment() {
    }
}
