package com.martha.finaldiciembre;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
falta corregir

 */
public class Main {
    public static void main(String[] args) {

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
        List<Position> listA = new ArrayList();
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

        List<Position> listB = new ArrayList();
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
        //ejercicio 1
        //merge
        int quantityVessels = 0;
        // Iteradores para listaA y listaB
        Iterator<Position> iteratorA = listA.iterator();
        Iterator<Position> iteratorB = listB.iterator();

        Position positionA = iteratorA.hasNext() ? iteratorA.next() : null;
        Position positionB = iteratorB.hasNext() ? iteratorB.next() : null;

        List<Position> unifiedList = new ArrayList();

        while (iteratorA.hasNext() && iteratorB.hasNext() && quantityVessels < 10) {
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
            if(dateAndTimeA == dateAndTimeB) { //cualquiera es los mismo si a o b
                unifiedList.add(positionA);
                positionA = iteratorA.hasNext() ? iteratorA.next() : null;
                positionB = iteratorB.hasNext() ? iteratorB.next() : null;

            }

            quantityVessels++;
        }

        while (iteratorA.hasNext() && quantityVessels < 10) {
            unifiedList.add(positionA);
            positionA = iteratorA.hasNext() ? iteratorA.next() : null;
            quantityVessels++;
        }

        while (iteratorB.hasNext() && quantityVessels < 10) {
            unifiedList.add(positionB);
            positionB = iteratorB.hasNext() ? iteratorB.next() : null;
            quantityVessels++;
        }

        System.out.println("--------------------Unified Positions--------------------");
        System.out.println("Date and Time|Registration|Latitude|Longitude");
        for (Position currentPosition : unifiedList) {
            System.out.println(currentPosition);
        }
    }
}