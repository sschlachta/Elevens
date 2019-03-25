package com.company;

public class Main {

    public static void main(String[] args) {


        //TEST DECK METHOD
        String t1[] = {"jack", "queen", "king"};
        String t2[] = {"blue", "red"};
        int t3[] = {11, 12, 13};

        Deck d1 = new Deck(t1, t2, t3);


        d1.size();


    }
}
