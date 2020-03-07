package com.louay.projects.registration.view;

import com.louay.projects.registration.view.controller.Dispatcher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        Dispatcher dispatcher = new Dispatcher();
        while (!"exit".equalsIgnoreCase(line)){
            System.out.println(dispatcher.dispatch(line));
            line = input.nextLine();
        }
    }
}
