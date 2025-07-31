package org.example;

// check if pallindrom or not using stream

public class CheckPallindrom {
    public static void main(String[] args) {
        String s= "madam";
        int length = s.length();

        for(int i=0;i<length/2;i++){
            if(s.charAt(i)!= s.charAt(length-1-i)){
                System.out.println("not pallindrom");
            }else System.out.println("pallindrom");

        }

        }


    }