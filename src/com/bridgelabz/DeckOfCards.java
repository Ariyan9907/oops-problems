package com.bridgelabz;

import java.util.Random;

public class DeckOfCards {

    public static String[] createDeck(){
        String[] suits={"Club","Diamonds","Hearts","Spades"};
        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8",
                "9", "10", "Jack", "Queen", "King", "Ace"
        };

        String[] deck=new String[52];
        int i=0;

        for(String suit:suits){
            for(String rank:ranks){
                deck[i]=rank+" of "+suit;
                i++;
            }
        }

        return deck;
    }

    //suffling
    public static void shuffleDeck(String[] deck){
        Random random = new Random();
        for(int i=0;i<deck.length;i++){
            int randomIdx=random.nextInt(deck.length);

            String temp=deck[i];
            deck[i]=deck[randomIdx];
            deck[randomIdx]=temp;
        }

    }

    //Distributing
    public static String[][] distributeCards(String[] deck){
        String[][] players = new String[4][9];
        int idx=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<9;j++){
                players[i][j]=deck[idx];
                idx++;
            }
        }
        return players;

    }

    // Prints the cards received by each player.
    public static void printPlayers(String[][] players) {

        for (int i = 0; i < players.length; i++) {

            System.out.println("Player " + (i + 1));

            for (int j = 0; j < players[i].length; j++) {

                System.out.println(players[i][j]);
            }
        }
    }

    // Starts the card distribution program.
    public static void main(String[] args) {

        String[] deck = createDeck();
        shuffleDeck(deck);
        String[][] players = distributeCards(deck);
        printPlayers(players);
    }

}
