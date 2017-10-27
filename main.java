/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarray;

import java.util.Scanner;

/**
 *
 * @author Marc
 */
public class JavaArray {
    

    public static int countVowel(String word, char[] array){
        int counter=0;
        for (int i=0; i<word.length();i++){
           for (int j=0; j<array.length;j++) {
               if (word.charAt(i)==array[j]){
                   counter++;
               }
           }
        }
        return counter;
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       boolean running=true;
        while(running){
       System.out.println("Enter a string");
       Scanner scanner = new Scanner(System.in);
       String word = scanner.nextLine();
       if (word.contentEquals("q")){
           running=false;
           break;
           
       }
       if (word.matches("[A-z]+")){
       String convertme="AEIOUaeiou";
       char[] array=convertme.toCharArray();
     int vowel =  countVowel(word,array);
     int consonants= word.length()-vowel;
     System.out.println("The string " + word + " has vowels: "+ vowel+" and consonants: " +consonants );
       }
       else System.out.println("Enter a valid word");
        }
    }
    

}
