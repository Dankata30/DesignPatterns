package com.yordanch.patterns.behavioral.chainOfResponsibility.client;

import com.yordanch.patterns.behavioral.chainOfResponsibility.middleware.Middleware;
import com.yordanch.patterns.behavioral.chainOfResponsibility.middleware.RoleCheckMiddleware;
import com.yordanch.patterns.behavioral.chainOfResponsibility.middleware.ThrottlingMiddleware;
import com.yordanch.patterns.behavioral.chainOfResponsibility.middleware.UserExistsMiddleware;
import com.yordanch.patterns.behavioral.chainOfResponsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");


        // Testing some reflection properties of Server class
        Class<?> serverClass = Class.forName("com.yordanch.patterns.behavioral.chainOfResponsibility.server.Server");
        for(Method m: serverClass.getDeclaredMethods()){
            //System.out.println(m.getName());
        }
        //System.out.println(serverClass.getDeclaredMethods().length);

        Field f = serverClass.getDeclaredField("test");
        //System.out.println(f.getName());

        Method method = serverClass.getDeclaredMethod("hasEmail", String.class);
        //System.out.println(method.getName());

        Method m2 = serverClass.getDeclaredMethod("isTest");
        //System.out.println(m2.getDeclaringClass().getName());

        Server server1 = (Server) serverClass.getConstructor().newInstance();
        boolean test = (boolean) m2.invoke(server1);
        //System.out.println("the return type of isTest: " + test);


        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        server.setMiddleware(middleware);
    }

    public static void run() throws IOException {
        try{
            init();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException | NoSuchFieldException e) {
            throw new RuntimeException(e);
        };

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
