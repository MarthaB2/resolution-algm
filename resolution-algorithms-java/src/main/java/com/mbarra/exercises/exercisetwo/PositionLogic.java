package com.mbarra.exercises.exercisetwo;

import java.util.ArrayList;
import java.util.List;

public class PositionLogic {

    public static void exerciseTwo()
    {
        ///position A
        List<Position> listA = new ArrayList<>();

        listA.add(new Position(1683298800, "REY20927", -34.393448F, -58.522747F));
        listA.add(new Position(1683298818, "REY20927", -34.393475F, -58.522743F));
        listA.add(new Position(1683298821, "REY22898", -34.41352F, -58.53201F));
        listA.add(new Position(1683298824, "REY19003", -34.431084F, -58.54326F));
        listA.add(new Position(1683298836, "REY20927", -34.3935F, -58.522736F));


        //position B
        List<Position> listB = new ArrayList<>();
        listB.add(new Position(1683298803, "REY22898", -34.413483F, -58.531963F));
        listB.add(new Position(1683298806, "REY19003", -34.431053F, -58.543316F));
        listB.add(new Position(1683298809, "REY20927", -34.39346F, -58.522743F));
        listB.add(new Position(1683298812, "REY19003", -34.43107F, -58.543285F));
        listB.add(new Position(1683298815, "REY22898", -34.4135F, -58.531986F));


        System.out.println("--------------------Positions  A--------------------");
        System.out.println("Date and Time|Registration|Latitude|Longitude");
        for (Position currentPosition : listA) {
            System.out.println(currentPosition);
        }

        System.out.println("--------------------Positions B--------------------");
        System.out.println("Date and Time|Registration|Latitude|Longitude");
        for (Position currentPosition : listB) {
            System.out.println(currentPosition);
        }

        /////////////////////////////
        //one
        //merge

        Position posiA;
        Position posiB;

        List<Position> unifiedList = new ArrayList<>();
        int i=0,j=0;



        while (i<listA.size() && j<listB.size()) {
            posiA=listA.get(i);
            posiB=listB.get(j);

            if (posiA.getDateAndTime() < posiB.getDateAndTime()) {

                unifiedList.add(posiA);
                i++;
            }
            if(posiA.getDateAndTime() > posiB.getDateAndTime()) {


                unifiedList.add(posiB);
                j++;
            }
            if(posiA.getDateAndTime() == posiB.getDateAndTime()) {

                unifiedList.add(posiA);
                i++;
                j++;
            }

        }


        while (i<listA.size() ) {
            posiA=listA.get(i);
            unifiedList.add(posiA);
            i++;
        }

        while (i<listB.size() ) {
            posiB=listB.get(i);
            unifiedList.add(posiB);
            j++;
        }


        System.out.println("--------------------Unified Positions--------------------");
        System.out.println("Date and Time|Registration|Latitude|Longitude");
        for (Position currentPosition : unifiedList) {
            System.out.println(currentPosition);
        }

    }






}
