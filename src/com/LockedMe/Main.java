package com.LockedMe;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void appSpecification(){
        System.out.println("****************************************");
        System.out.println("*                                      *");
        System.out.println("*    Application Name: Locked Me       *");
        System.out.println("*    Developed By : Karthikeyan Sekar  *");
        System.out.println("*    Version: 1.0.0                    *");
        System.out.println("*                                      *");
        System.out.println("****************************************");
    }
    public static void main(String args[]){


        appSpecification();

        userInteractionConsole userConsole = new userInteractionConsole();

        try {
            userConsole.userConsole();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
