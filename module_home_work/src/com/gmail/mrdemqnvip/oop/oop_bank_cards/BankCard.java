package com.gmail.mrdemqnvip.oop.oop_bank_cards;


public abstract class BankCard {

    public void bankName() {
        System.out.println("Alpha-Bank ");
    }

    public abstract void typeCard();

    public abstract void validity();

    public void cardInserted () {

        System.out.println("Card inserted into ATM ");
    }
    public void withdrawCash() {
        System.out.println("Cash withdrawn from the card");
    }
    public void getCard() {

        System.out.println("Get a card from an ATM");
    }
}