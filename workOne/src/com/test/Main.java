package com.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(StringCountingLetters(scanner.nextLine()));
    }

    private static StringBuilder StringCountingLetters(String sourceText){
        if (sourceText.isEmpty()) {
            return new StringBuilder("Строка пустая!");
        }

        StringBuilder srcText = new StringBuilder(sourceText);
        StringBuilder outText = new StringBuilder();
        srcText.append(" ");
        int countChar = 0;
        for (int i = 0; i < srcText.length() - 1; i++) {
            if (srcText.charAt(i) == srcText.charAt(i + 1)) {
                countChar++;
            } else {
                if (countChar == 0) {
                    outText.append(srcText.charAt(i));
                } else {
                    outText.append(++countChar).append(srcText.charAt(i));
                    countChar = 0;
                }
            }
        }
        return outText;
    }
}
