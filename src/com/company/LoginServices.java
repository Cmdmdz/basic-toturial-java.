package com.company;

public interface LoginServices {

    public  void createNewLogin(String firstName , String lastName, String username);
    public boolean isValida(String password);
    public String generatePassword(String password);
    public String getFourLetters(String s);

}
