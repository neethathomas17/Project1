package com.company;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// creating a personal inventory store from home during the pandemic

        System.out.printf("The date is %tD\n", new Date() );
        System.out.println("Welcome to Sarah's online store where you can find a variety of clothing items");
        System.out.println("What is the customer's full name?");
        Scanner input = new Scanner(System.in);
        String customerName = input.next();
        final double shippingRate = 2.39;




        String [] [] clothing = new String[5][3];

        clothing [0][0] = "Clothing Type |";
        clothing [0][1] = "Clothing Size | ";
        clothing [0][2] = "Clothing Price |";

        clothing [1][0] = "Purple Sweatshirt :";
        clothing [1][1] = "Small |";
        clothing [1][2] = "$19.99";

        clothing [2][0] = "Tie-dye Sweatpants:";
        clothing [2][1] = "Medium | ";
        clothing [2][2] = "$25.79";

        clothing [3][0] = "Embroidered Lavender Bucket Hat:";
        clothing [3][1] = "Large |";
        clothing [3][2] = "$12.25";

        clothing [4][0] = "Cropped Blue Sweater:";
        clothing [4][1] = "Extra Large |";
        clothing [4][2] = "$35.69";

        int rows = 5;
        int columns = 3;

        int i, j;
        for (i=0; i < rows ; i++) {

            for (j=0; j < columns ; j++) {

                System.out.print(clothing[ i ][ j ] + " " );

            }
            System.out.println();

        }
        System.out.println("Your choices are customer service, tracking, contact number, shipping");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an option for general information for the company: ");

        String storeOption = sc.nextLine();
        Showmyoption(storeOption);
    }


    public static  void Showmyoption(String mychoice) {
        switch (mychoice) {
            case "Customer Service":

                System.out.println ("Contact sarahhomeshop@gmail.com for further inquires. ");
                break;
            case "Tracking":

                System.out.println ("Online tracking is available with every order");
                break;
            case "Contact number":

                System.out.println ("Company Number: 813-694-3795 ");
                break;

            case "Shipping":
                System.out.println ("Typical order take between 3-5 business ");
                break;

            default:
                System.out.println ("Invalid option");
        }


}}

