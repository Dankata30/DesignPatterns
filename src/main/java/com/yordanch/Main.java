package com.yordanch;

import com.yordanch.patterns.behavioral.chainOfResponsibility.client.Demo;
import com.yordanch.patterns.structural.adapter.client.DemoAdapter;
import com.yordanch.patterns.structural.decorator.client.DemoDecorator;
import com.yordanch.patterns.structural.facade.client.DemoFacade;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Run builder design pattern
//        Demo builder = new Demo();
//        builder.run();

//        DemoAdapter adapter = new DemoAdapter();
//        adapter.run();

//        DemoDecorator decorator = new DemoDecorator();
//        decorator.run();

//        DemoFacade facade = new DemoFacade();
//        facade.run();

        Demo chainOfResponsibility = new Demo();
        chainOfResponsibility.run();
    }
}