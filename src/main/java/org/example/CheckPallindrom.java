package org.example;

// check if pallindrom or not using stream

public class CheckPallindrom {
    public static void main(String[] args) {
        String s= "madam";
        int length = s.length();
        boolean isPalindrome = true;


        for(int i=0;i<length/2;i++){
            if(s.charAt(i)!= s.charAt(length-1-i)){
                isPalindrome=false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }


    }


    }