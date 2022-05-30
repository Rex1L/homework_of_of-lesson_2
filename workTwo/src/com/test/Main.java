package com.test;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(checkingAllBrackets(scanner.nextLine()));
    }

    private static boolean checkingAllBrackets(String sourceText){
        if (sourceText.isEmpty()) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        int lengthSrcText = sourceText.length();
        for (int i = 0; i < lengthSrcText; i++) {
            char openBracket = sourceText.charAt(i);
            if (openBracket == '(' || openBracket == '{' || openBracket == '[') {
                stack.push(openBracket);
            } else {
                if (stack.isEmpty())
                    return false;
                if ((stack.peek() == "(".charAt(0) && openBracket == ")".charAt(0))
                        || (stack.peek() == "{".charAt(0) && openBracket == "}".charAt(0))
                        || (stack.peek() == "[".charAt(0) && openBracket == "]".charAt(0)))
                {
                    stack.pop();
                }
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
