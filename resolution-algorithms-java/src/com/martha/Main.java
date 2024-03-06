package com.martha;

import com.martha.ejercicios.Account;
import com.martha.finaldiciembre.Position;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
falta corregir

 */
public class Main {
    public static void main(String[] args) {

        String option;
        Scanner input = new Scanner(System.in); //supuestaemnte se puede cerrar el scanner scanner.close();

        do {
            showMenu();
            option = input.next();

            switch (option)
            {
                case "one":
                    exerciseOne();
                    break;


                case "two":
                    endDecember();
                    break;
/*
                case "three":
                    exerciseThree();
*/
                case "three":
                    System.out.println("Exiting the program.");
                    break;

                default:
                    if (!option.equals("three"))
                        System.out.println("Invalid option. Please try again.");
            }
        }while(!option.equals("three"));


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

    public static void exerciseOne()
    {
        Account accountOne = new Account("Martha Barra");
        Account accountTwo = new Account("Gustavo Claros",1000);

        accountOne.deposit(1000);
        accountTwo.deposit(1000);

        accountOne.withdraw (500);
        accountTwo.withdraw (500);

        System.out.println(accountOne); // con el tostring me permite mostral asi
        System.out.println(accountTwo);


    }

    public static void endDecember()
    {
        ///position A
        Position posA1 = new Position(1683298800, "REY20927", -34.393448F, -58.522747F);
        Position posA2 = new Position(1683298818, "REY20927", -34.393475F, -58.522743F);
        Position posA3 = new Position(1683298821, "REY22898", -34.41352F, -58.53201F);
        Position posA4 = new Position(1683298824, "REY19003", -34.431084F, -58.54326F);
        Position posA5 = new Position(1683298836, "REY20927", -34.3935F, -58.522736F);

        //position B
        Position posB1 = new Position(1683298803, "REY22898", -34.413483F, -58.531963F);
        Position posB2 = new Position(1683298806, "REY19003", -34.431053F, -58.543316F);
        Position posB3 = new Position(1683298809, "REY20927", -34.39346F, -58.522743F);
        Position posB4 = new Position(1683298812, "REY19003", -34.43107F, -58.543285F);
        Position posB5 = new Position(1683298815, "REY22898", -34.4135F, -58.531986F);


        //CARGAMOS LAS POSICIONES
        List<Position> listA = new ArrayList<>();
        listA.add(posA1);
        listA.add(posA2);
        listA.add(posA3);
        listA.add(posA4);
        listA.add(posA5);
        System.out.println("--------------------Positions  A--------------------");
        System.out.println("Date and Time|Registration|Latitude|Longitude");
        for (Position currentPosition : listA) {
            System.out.println(currentPosition);
        }

        List<Position> listB = new ArrayList<>();
        listB.add(posB1);
        listB.add(posB2);
        listB.add(posB3);
        listB.add(posB4);
        listB.add(posB5);

        System.out.println("--------------------Positions B--------------------");
        System.out.println("Date and Time|Registration|Latitude|Longitude");
        for (Position currentPosition : listB) {
            System.out.println(currentPosition);
        }

        /////////////////////////////
        //one
        //merge
        int quantityVessels = 0;
        // Iterators : listA y listB
        Iterator<Position> iteratorA = listA.iterator();
        Iterator<Position> iteratorB = listB.iterator();

        Position positionA = iteratorA.hasNext() ? iteratorA.next() : null;
        Position positionB = iteratorB.hasNext() ? iteratorB.next() : null;

        List<Position> unifiedList = new ArrayList<>();

        while (iteratorA.hasNext() && iteratorB.hasNext() ) {
            int dateAndTimeA = positionA.getDateAndTime();
            int dateAndTimeB = positionB.getDateAndTime();

            if (dateAndTimeA < dateAndTimeB) {
                unifiedList.add(positionA);
                positionA = iteratorA.hasNext() ? iteratorA.next() : null;
            }
            if(dateAndTimeA > dateAndTimeB) {
                unifiedList.add(positionB);
                positionB = iteratorB.hasNext() ? iteratorB.next() : null;
            }
            if(dateAndTimeA == dateAndTimeB) {
                unifiedList.add(positionA);
                positionA = iteratorA.hasNext() ? iteratorA.next() : null;
                positionB = iteratorB.hasNext() ? iteratorB.next() : null;

            }

        }

        if(positionA.getDateAndTime() < positionB.getDateAndTime())
        {
            //se come el ultimo elemento el iterator, por ello hago esto, pero me trae dudas
            if (positionA != null) {
                unifiedList.add(positionA);
            }

            if (positionB != null) {
                unifiedList.add(positionB);
            }
        }else{
            if (positionB != null) {
                unifiedList.add(positionB);
            }

            if (positionA != null) {
                unifiedList.add(positionA);
            }
        }

        while (iteratorA.hasNext() ) {
            unifiedList.add(positionA);
            positionA = iteratorA.hasNext() ? iteratorA.next() : null;

        }

        while (iteratorB.hasNext() ) {
            unifiedList.add(positionB);
            positionB = iteratorB.hasNext() ? iteratorB.next() : null;

        }


        System.out.println("--------------------Unified Positions--------------------");
        System.out.println("Date and Time|Registration|Latitude|Longitude");
        for (Position currentPosition : unifiedList) {
            System.out.println(currentPosition);
        }
    }





}