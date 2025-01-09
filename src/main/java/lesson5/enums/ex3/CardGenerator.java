package main.java.lesson5.enums.ex3;

import java.util.Random;

public class CardGenerator {
    public static void main(String[] args) {
        printRandomCard();
    }

    //Написать программу генератор случайной карты, которая будет иметь
    // статический метод  printRandomCard() вывода в консоль случайно сгенерированной карты.
    //Создать два отдельных  Enum CardsTypes, CardValues.
    //CardsTypes может быть четырех видов ♦, ♠, ♣, ♥.
    // CardValues : SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
    //Создать класс Card, который в параметры конструктора будет принимать аргументы типа CardsTypes, CardValues


    public static void printRandomCard() {
        System.out.println(new Card(getRandomValue(), getRandomType()));
    }

    public static CardValues getRandomValue() {
        CardValues[] cardValues = CardValues.values();
        int randomIndex = new Random().nextInt(cardValues.length);
        return cardValues[randomIndex];
    }

    public static CardsTypes getRandomType() {
        CardsTypes[] cardTypes = CardsTypes.values();
        int randomIndex = new Random().nextInt(cardTypes.length);
        return cardTypes[randomIndex];
    }


    public enum CardsTypes {
        DIAMOND("♦"), SPADE("♠"), CLUB("♣"), HEART("♥");
        private String value;

        public String getValue() {
            return value;
        }

        CardsTypes(String value) {
            this.value = value;
        }
    }

    public enum CardValues {
        SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }

    public static class Card {
        private CardValues cardValues;
        private CardsTypes cardsTypes;

        public Card(CardValues cardValues, CardsTypes cardsTypes) {
            this.cardValues = cardValues;
            this.cardsTypes = cardsTypes;
        }

        @Override
        public String toString() {
            return cardValues + cardsTypes.getValue();
        }
    }


}
