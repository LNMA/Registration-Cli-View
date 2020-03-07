package com.louay.projects.registration.view.controller;

public class Dispatcher {

    public String dispatch(String line){
        String command = line.split(" ")[0];
        Controller controller = ServiceLocator.getControllers(command);
        return controller.execute(command);
    }
}
