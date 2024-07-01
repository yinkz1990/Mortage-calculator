package com.codewitholayinka;

import java.util.Scanner;

public class Console {

    private Scanner scanner = new Scanner(System.in);

    public double readNumber(String prompt, double min, double max) {

        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
}
