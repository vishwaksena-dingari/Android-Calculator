package com.example.calculator;

public class ModifyString {

    public static String modify(String string) {
        String stringFinal = "";
        if (!string.contains("(") && !string.contains(")")) {
            return string;
        }
        if (string.contains("(")) {
            String[] array = string.split("(?=\\()");
            int x = array.length;
            for (int i = 0; i < x - 1; i++) {
                String str = (array[i]);
                int y = ((array[i]).length());
                Character charactern = str.charAt((y - 1));
                Character character0 = ((array[i + 1]).charAt(0));
                if ((Character.isDigit(charactern)) && (character0 == '(')) {
                    str = str + "*";
                } else if ((charactern == ')') && (character0 == '(')) {
                    str = str + "*";
                }
                stringFinal = stringFinal + str;
            }
            stringFinal = stringFinal + array[x - 1];
        }
        string = stringFinal;
        stringFinal = "";
        if (string.contains(")")) {
            String[] array = string.split("(?<=\\))");
            int x = array.length;
            for (int i = 0; i < x - 1; i++) {
                String str = (array[i]);
                int y = ((array[i]).length());
                Character charactern = str.charAt((y - 1));
                Character character0 = ((array[i + 1]).charAt(0));
                if ((charactern == ')') && Character.isDigit(character0)) {
                    str = str + "*";
                } else if ((charactern == ')') && (character0 == '(')) {
                    str = str + "*";
                }
                stringFinal = stringFinal + str;
            }
            stringFinal = stringFinal + array[x - 1];
        }
        return stringFinal;
    }
}
