package com.mbarra;

import com.mbarra.exercises.exerciseone.AccountLogic;
import com.mbarra.exercises.exercisetwo.PositionLogic;

import java.util.Scanner;

import static com.mbarra.exercises.exercisethree.ContactListLogic.exerciseThree;

public class Main {
    public static void main(String[] args) {

        String option;
        Scanner input = new Scanner(System.in);

        do {
            showMenu();
            option = input.next();

            switch (option)
            {
                case "one":
                    AccountLogic.exerciseOne();
                    break;


                case "two":
                    PositionLogic.exerciseTwo();
                    break;

                case "three":
                    exerciseThree();

                case "four":
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }while(!option.equals("four"));


    }

    public static void showMenu()
    {
        System.out.println("Menu:");
        System.out.println("Exercise one:");
        System.out.println("Exercise two(endDecember):");
        System.out.println("Exercise three:");
        System.out.println("Exit:");
        System.out.print("Select an option: ");
    }



}