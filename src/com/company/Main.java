package com.company;

public class Main {

    public static void main(String[] args) {

        String thisCode = "What a fantastic and beautiful morning.";
        System.out.println(thisCode);

        Code code1 = new Code(thisCode);

        code1.hide(3, 9);
        String hiddenCode = code1.getCode();

        code1.recover(6, 13);
        String recoveredCode = code1.getCode();

        System.out.println(hiddenCode);
        System.out.println(recoveredCode);

        System.out.println("Char array: " + code1.temporary());

    }
}
