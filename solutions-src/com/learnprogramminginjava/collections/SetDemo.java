package com.learnprogramminginjava.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public enum Color {
        RED, BLACK
    }
    public enum Values {
        ACE,
        KING,
        QUEEN,
        JACK,
        TEN,
        NINE,
        EIGHT,
        SEVEN,
        SIX,
        FIVE,
        FOUR,
        THREE,
        DEUCE
    }

    public static abstract class Suit{
        protected String name;
        protected Color color;
        public Suit(){}
        @Override
        public String toString() {
            return this.getClass().getSimpleName();
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;

            Suit suit = (Suit) o;
            return name.equals(suit.name) && color == suit.color;
        }

        @Override
        public int hashCode() {
            int result = name.hashCode();
            result = 31 * result + color.hashCode();
            return result;
        }
    }
    public static class Hearts extends Suit{
        public Hearts(){
            super.name = "Hearts";
            super.color = Color.RED;
        }
    }
    public static class Spades extends Suit{
        public Spades(){
            super.name = "Spades";
            super.color = Color.BLACK;
        }
    }
    public static class Diamonds extends Suit{
        public Diamonds(){
            super.name = "Diamonds";
            super.color = Color.RED;

        }
    }
    public static class Clubs extends Suit{
        public Clubs(){
            super.name = "Clubs";
            super.color = Color.BLACK;
        }
    }

    public static class Card {
        private final Suit suit;
        private final Values value;

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;

            Card card = (Card) o;
            return suit.equals(card.suit) && value == card.value;
        }

        @Override
        public int hashCode() {
            int result = suit.hashCode();
            result = 31 * result + value.hashCode();
            return result;
        }

        public Card(Values value, Suit suit) {
            this.suit = suit;
            this.value = value;
        }
        public Suit getSuit() {
            return suit;
        }
        public Values getValue() {
            return value;
        }
    }


    public static void main(String[] args) {
        Set<Card> suits = new HashSet<>();
        suits.add(new Card(Values.ACE, new Diamonds()));
        suits.add(new Card(Values.ACE, new Spades()));
        suits.add(new Card(Values.ACE, new Clubs()));
        // ignored b/c of equals()
        suits.add(new Card(Values.ACE, new Clubs()));
        suits.add(new Card(Values.ACE, new Hearts()));

        for (Card c : suits) {
            System.out.println("Card : " + c.getValue() + " : " + c.getSuit());
        }
    }
}
