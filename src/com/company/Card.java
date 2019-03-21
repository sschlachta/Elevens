package com.company;

public class Card {

    private String suit;
    private String rank;
    private int pointValue;

    public Card(String cardRank, String cardSuit, int cardPointValue) {

        rank = cardRank;
        suit = cardSuit;
        pointValue = cardPointValue;

    }

    public String suit() {

        return suit;

    }

    public String rank() {

        return rank;

    }

    public int pointValue() {

        return pointValue;

    }


    public boolean matches(Card otherCard) {

        if(rank.equalsIgnoreCase(otherCard.rank()) && suit.equalsIgnoreCase(otherCard.suit()) && pointValue == otherCard.pointValue()){

            return true;

        } else{

            return false;

        }
    }

    @Override
    public String toString() {

        System.out.println(rank + " of " + suit + " (point value = " + pointValue + ")");

        return null;

    }
}