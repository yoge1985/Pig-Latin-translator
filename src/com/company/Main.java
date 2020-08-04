package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        pigLatinTranslator();

    }

    private static boolean isVowel(String word){
        if (word.charAt(0) == 'a' || word.charAt(0) =='e' || word.charAt(0)== 'i'
            || word.charAt(0) == 'o' || word.charAt(0) == 'u'){
            String pigLatin = word + "way";
            return true;
        }else {
            return false;
        }
    }
    // prompts user to write a sentence, program converts the sentence into pig latin
    private static void pigLatinTranslator(){
        String pigLatin;
        Scanner scanner = new Scanner(System.in);
        System.out.println("write a sentence:");
        String sentence = scanner.nextLine();
        String[]arrayOfSentence = sentence.split(" ");
        for (String str : arrayOfSentence){

            String initialConsonants = str.replaceAll("([^aeiou]*).*","$1");
            int value = initialConsonants.length();
            String withoutInitialConsonant = str.substring(value);
            pigLatin = withoutInitialConsonant + initialConsonants + "ay";
            if (isVowel(str)){
                pigLatin = str + "way";
            }

            System.out.print(pigLatin + " ");

        }

    }
}
