package com.louay.projects.registration.view.controller;

import java.util.HashMap;
import java.util.Map;

public class ServiceLocator {

    private static final Map<String,Controller> controllers;

    static {
        controllers =new HashMap<String, Controller>();
        controllers.put("login", new LoginController());
        controllers.put("sign up", new SignUp());
        controllers.put("register", new RegisterController());
        controllers.put("list", new ListController());
    }

    public static Controller getControllers(String command) {
        return controllers.get(command);
    }
}
