/*
 * This program will determine if user's input is a polindrome regardless on special symbols like commas, quastion signs etc.
 * 
 * @author Mykhailo Kosenko
 * @version 11/26/2022
 */
package Palindrome;

import java.util.Scanner;

public class Console{
    /*
     * @param input string from user that will be changed by removing all special characters and whitespaces, 
     * turning all letters into lower case, and flipping it to check if it is polindrome.
     * @return true if it is polindrome
     */
    public static boolean checker(String input){
        String newStr = "";
        String reverse = "";
        switch(input.length()){
            case 0:
                System.out.print("There is nothing there!!!\nI hope you understand that answer will be: ");
                break;
            case 1:
                char ch = input.charAt(0);
                if(Character.isDigit(ch)){
                    System.out.print("It is digit.One digit.\nI hope you understand that answer will be: ");
                } else if(Character.isWhitespace(ch)){
                    System.out.print("It is whitespace!What do you think?That it will work with me?\nAnswer is: ");
                } else if(Character.isUpperCase(ch)){
                    System.out.print("It is just upper case letter.How it could be a palindrome?\nAnswer is: ");
                } else if(Character.isLowerCase(ch)){
                    System.out.print("It is just lower case letter.How it could be a palindrome?\nAnswer is: ");
                } else {
                    System.out.print("What it is?\nAnswer is: ");
                }
                break;
            default:
                //make newStr repeat the string of user's input without whitespaces, commas, quastion signs and etc.
                for(int i = 0;i < input.length();i++){
                    char k = input.charAt(i);
                    if(Character.isLetterOrDigit(k)){
                        newStr += k;
                    }
                }
                newStr = newStr.toLowerCase();//cast it to lower case special for method .equals()
                //flipps the string
                int j = newStr.length() - 1;
                for(;j >= 0;j--){
                    char k = newStr.charAt(j);
                    if(Character.isLetterOrDigit(k)){
                        reverse += k;
                    }
                }

        
        }
        //check if it is polindrome
        if(reverse.equals(newStr)){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args){
        Scanner kboard = new Scanner(System.in);
        System.out.println("Hello!This program will display true if your input is \"palindrome\".");
        System.out.println("Hint: try to input something like \"Don't nod\" or \"I did, did I?\" or just level, kayak, deed and even 2002: ");
        String inputScanner = kboard.nextLine();
        System.out.println(checker(inputScanner));
    }
}