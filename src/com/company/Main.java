package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// prompts user to write a sentence and then the program converts the sentence into pig latin

        Scanner scanner = new Scanner(System.in);
        System.out.println("write a sentence:");
        String sentence = scanner.nextLine();
        String[]arrayOfSentence = sentence.split(" ");
        for (String str : arrayOfSentence){

            String initialConsonants = str.replaceAll("([^aeiou]*).*","$1");
            int value = initialConsonants.length();
            String withoutInitialConsonant = str.substring(value);
            String pigLatin = withoutInitialConsonant + initialConsonants + "ay";

            System.out.print(pigLatin + " ");

        }


//        String[]arrayOfSentence = sentence.split(" ");

//        for (String str : arrayOfSentence){
//            String initialConsonants = str.replaceAll("([^aeiou]*).*","$1");
//
//        }
        
    }
}
