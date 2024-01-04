package com.yordanch;

import com.yordanch.patterns.builder.client.Demo;
import com.yordanch.patterns.structural.adapter.client.DemoAdapter;

public class Main {
    public static void main(String[] args) {
        // Run builder design pattern
//        Demo builder = new Demo();
//        builder.run();

        DemoAdapter adapter = new DemoAdapter();
        adapter.run();
    }
}