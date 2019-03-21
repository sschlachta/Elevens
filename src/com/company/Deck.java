package com.company;
import java.util.*;
import java.io.*;


public class Deck {

    private String ranks[] = new String[50];
    private String suits[] = new String[50];
    private int pointValues[] = new int[50];

    private int size;


    public Deck(String cardRanks[], String cardSuits[], int cardPointValues[]){

        ranks = cardRanks;
        suits = cardSuits;
        pointValues = cardPointValues;

        ArrayList deck = new ArrayList();

            String setRank;
            String setSuit;
            int setPV;

            int param;

            


            for (int i = 0; i < pointValues.length; i++){

               setRank = ranks[i];
               setSuit = suits[i];
               setPV = pointValues[i];

               Card nc = new Card(setRank, setSuit, setPV);
               deck.add(nc);

            }

    }

    public boolean isEmpty(){

        if(size == 0){

            return true;

        } else{

            return false;

        }

    }

    public int size() {

        return size;

    }

}
