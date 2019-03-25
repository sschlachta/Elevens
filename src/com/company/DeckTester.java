package com.company;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {


        String testRank[] = {"A", "B", "C"};
        String testSuit[]= {"Giraffes", "Lions"};
        int testValue[] = {2, 1, 6};

        Deck testDeck =new Deck(testRank, testSuit, testValue);

        System.out.println(testDeck.toString());

    }

}
