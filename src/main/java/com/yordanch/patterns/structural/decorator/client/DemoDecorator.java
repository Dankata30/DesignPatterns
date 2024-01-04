package com.yordanch.patterns.structural.decorator.client;

import com.yordanch.patterns.structural.decorator.decorators.*;
public class DemoDecorator {
    public static void run() {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        DataSourceDecorator encoded =
                new CompressionDecorator(
                    new EncryptionDecorator(
                        new FileDataSource("OutputDemo.txt")));

        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
