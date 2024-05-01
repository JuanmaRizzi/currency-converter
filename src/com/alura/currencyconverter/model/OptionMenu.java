package com.alura.currencyconverter.model;

import java.util.Scanner;

public class OptionMenu {


    Connection con = new Connection();
    ConvertionRates convertionRates =  con.toConnect();




    public void menu(){

        Scanner scn = new Scanner(System.in);
        while (true) {


            System.out.println("********************************************\\n\\n");
            System.out.println("Welcome to the Currency Converter!! ");
            System.out.println("Select the option based on your needs: ");
            System.out.println("1) Change from ARS >>> USD");
            System.out.println("2) Change from USD >>> ARS");
            System.out.println("3) Change from USD >>> BRL");
            System.out.println("4) Change from BRL >>> USD");
            System.out.println("5) Change from USD >>> BOB");
            System.out.println("6) Change from BOB >>> USD");
            System.out.println("7) Exit");
            int choice = scn.nextInt();
            if (choice == 7) {
                System.out.println("The currency converter process ended");
                break;
            }
            System.out.println("Select the amount to change:");
            Float amount = scn.nextFloat();


            switch (choice) {

                case 1: {
                    Float convertedValue = amount / convertionRates.ARS();
                    System.out.println(" Change " + amount + " from ARS to USD " + convertedValue);
                    break;
                }
                case 2: {
                    Float convertedValue = amount * convertionRates.ARS();
                    System.out.println(" Change " + amount + " from USD to ARS " + convertedValue);
                    break;
                }
                case 3: {
                    Float convertedValue = amount / convertionRates.BRL();
                    System.out.println(" Change " + amount + " from BRL to USD " + convertedValue);
                    break;

                }
                case 4: {
                    Float convertedValue = amount * convertionRates.BRL();
                    System.out.println(" Change " + amount + " from USD to BRL " + convertedValue);
                    break;
                }

                case 5: {
                    Float convertedValue = amount / convertionRates.BOB();
                    System.out.println(" Change " + amount + " from BOB to USD " + convertedValue);
                    break;

                }
                case 6: {
                    Float convertedValue = amount *convertionRates.BOB();
                    System.out.println(" Change " + amount + " from USD to BOB " + convertedValue);
                    break;
                }


            }

        }


    }
}
