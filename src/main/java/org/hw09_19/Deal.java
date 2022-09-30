package org.hw09_19;

import java.util.Random;
import java.util.Scanner;

public class Deal {
    public static void main(String[] args) {

        final int cardsForPlayer = 5;
        int players;

        final String[] suits = {Suits.CLUBS.getName(), Suits.DIAMONDS.getName(), Suits.HEARTS.getName(), Suits.SPADES.getName()};

        final String[] rank = {Rank.ONE.getName(), Rank.TWO.getName(), Rank.THREE.getName(), Rank.FOUR.getName(), Rank.FIVE.getName(), Rank.SIX.getName(), Rank.SEVEN.getName(), Rank.EIGHT.getName(), Rank.NINE.getName(), Rank.TEN.getName(), Rank.JACK.getName(), Rank.QUEEN.getName(), Rank.KING.getName(), Rank.ACE.getName()};

        final int numberOfCards = suits.length * rank.length; // number of cards

        players = getNumberOfPlayers(cardsForPlayer, numberOfCards);

        // deck initialization
        String[] deck = Deck.initializeDeck(suits, rank, numberOfCards);

        // deck shuffling
        Deck.shuffleDeck(numberOfCards, deck);

        // the shuffled deck is displayed
        Deck.displayDeck(cardsForPlayer, players, deck);
    }


    private static int getNumberOfPlayers(int cardsForPlayer, int numberOfCards) {
        int players;
        final Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number of players: ");

            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (cardsForPlayer * players <= numberOfCards) {
                    break;
                } else {
                    if (players == 0) {
                        System.out.println("The game has been terminated.");
                        break;
                    } else if (players < 0) {
                        System.out.println("The number of players cannot be less than 0");
                    } else {
                        System.out.println("Too many players!");
                    }
                }
            } else {
                System.out.println("You have not entered a number, or your number is too large!");
            }
        }
        return players;
    }
}
