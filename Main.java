//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package com.codewitholayinka;


public class Main {


    public static void main(String[] args) {
           Console console = new Console();

           int  principal = (int) console.readNumber("Principal: ", 1000, 1_000_000);
           float annualInterest = (float) console.readNumber("Annual Interest Rate: ", 1, 30);
           byte years = (byte) console.readNumber("Period (Years): ", 1, 30);

           Calculator calculator = new Calculator(principal,annualInterest,years);
           printStatement print = new printStatement(calculator);
           print.printMortgage();
           print.printPaymentSchedule();
    }


    }


