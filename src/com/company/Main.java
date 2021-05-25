package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LoginServiceImlp loginServiceImlp = new LoginServiceImlp();

        Scanner sc=new Scanner(System.in);

        System.out.println("----------registered----------");
        System.out.println("Please enter the registered firstname");
        String firstName = sc.nextLine();

        System.out.println("Please enter the registered lastname");
        String lastName = sc.nextLine();

        System.out.println("Please enter the registered passwird");
        String password = sc.nextLine();
        loginServiceImlp.createNewLogin(firstName, lastName,password );

    }
}
