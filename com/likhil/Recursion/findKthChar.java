package com.likhil.Recursion;

public class findKthChar {
    public static void main(String[] args) {
        int k = 8;
        String ret = generate("a","",k);
        System.out.println(ret.length());
        System.out.println(ret.charAt(k));
    }
    public static String generate(String s, String ret, int k){
        if(s.length()>=k+1){
            return s;
        }
        for( int i=0; i<s.length();i++){
            int asc = s.charAt(i);

            char c = (char) (asc+1);

            ret += c;

        }
        return generate(s+ret, "",k);
    }
}
