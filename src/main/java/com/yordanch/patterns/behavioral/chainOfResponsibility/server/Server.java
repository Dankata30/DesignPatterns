package com.yordanch.patterns.behavioral.chainOfResponsibility.server;

import com.yordanch.patterns.behavioral.chainOfResponsibility.middleware.Middleware;

import java.util.HashMap;
import java.util.Map;

public class Server {
    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    private boolean test = false;

    public boolean isTest() {
        return test;
    }

    public void setTest(boolean test) {
        this.test = test;
    }

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean logIn(String email, String password) {
        if (middleware.check(email, password)) {
            System.out.println("Authorization have been successful!");

            // Do something useful here for authorized users.

            return true;
        }
        return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}