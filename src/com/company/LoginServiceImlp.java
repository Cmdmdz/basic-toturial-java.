package com.company;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LoginServiceImlp implements LoginServices{
    String firstName;
    String lastName;
    String username;
    String password;
    private static ArrayList<UserInformation> array=new ArrayList<UserInformation>();
    UserInformation user = new UserInformation();

    @Override
    public void createNewLogin(String firstName , String lastName, String password) {
        UserInformation u=new UserInformation();
        u.setLastName(lastName);
        u.setFirstName(firstName);

        if(firstName.length() < 4 || lastName.length() < 4 ) {
            u.setUsername(username + firstName);
        }else {
            u.setUsername(username.substring(0,4) + firstName.substring(0,4));
        }
        if(isValida(password) == false){
            u.setPassword(generatePassword(password));

        }else {
            u.setUsername(password);
        }
    }

    @Override
    public boolean isValida(String password) {

       int intValue = Integer.parseInt(password);
        if(password == null || password.equals("")) {

            return false;
        }

        try {
            intValue = Integer.parseInt(password);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Integer.");
        }

        return false;
    }

    @Override
    public String generatePassword(String password) {
        byte[] array = new byte[8];
        new Random().nextBytes(array);
        password =  new String(array, Charset.forName("UTF-8"));
        return password;
    }

    @Override
    public String getFourLetters(String s) {
        if(s.length() < 4){
            return "S" ;
        }
        return null;
    }
}
