package com.likhil.Recursion;

public class capitalLetter {
    public static void main(String[] args) {
        String s = "likhilkosuru";
        capital(s);
    }
    public static void capital(String s) {
        if(s.length()==0){
            System.out.println("No capital letter");
            return;
        }
        if(Character.isUpperCase(s.charAt(0))){
            System.out.println(s.charAt(0));
        }
        capital(s.substring(1));
    }
}
