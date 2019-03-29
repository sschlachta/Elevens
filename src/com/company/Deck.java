package com.company;
import java.util.*;
import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class Deck {


    private List<Card> cards;
    private int size;


    public Deck(String[] ranks, String[] suits, int[] values) {

        cards = new ArrayList<>();

        for(int i = 0; i < ranks.length; i++){

            for(int k = 0; k < suits.length; k++){

                    cards.add(new Card(ranks[i], suits[k], values[i]));

            }

        }

        size = cards.size();
        shuffle();

    }


    /**
     * Determines if this deck is empty (no undealt cards).
     * @return true if this deck is empty, false otherwise.
     */
    public boolean isEmpty() {

        if(size == 0){

            return true;

        } else {

            return false;

        }

    }

    /**
     * Accesses the number of undealt cards in this deck.
     * @return the number of undealt cards in this deck.
     */
    public int size() {

        return size;

    }

    /**
     * Randomly permute the given collection of cards
     * and reset the size to represent the entire deck.
     */
    public void shuffle() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */

        Card cards[] = new Card[52];
        Card empty = new Card("Empty", "Empty", 60);

        Card shuffled[] = new Card[52];

        for (int k = 0; k <=51; k++){

            Random rand = new Random();
            int j = rand.nextInt(51);

                shuffled[k] = cards[j];
                cards[j] = empty;


        }

    }



    /**
     * Deals a card from this deck.
     * @return the card just dealt, or null if all the cards have been
     *         previously dealt.
     */
    public Card deal() {

            if(isEmpty()){

                return null;

            }

            size = size - 1;
            return cards.get(size);

    }

    /**
     * Generates and returns a string representation of this deck.
     * @return a string representation of this deck.
     */
    @Override
    public String toString() {
        String rtn = "size = " + size + "\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--) {
            rtn = rtn + cards.get(k);
            if (k != 0) {
                rtn = rtn + ", ";
            }
            if ((size - k) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= size; k--) {
            rtn = rtn + cards.get(k);
            if (k != size) {
                rtn = rtn + ", ";
            }
            if ((k - cards.size()) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\n";
        return rtn;
    }
}