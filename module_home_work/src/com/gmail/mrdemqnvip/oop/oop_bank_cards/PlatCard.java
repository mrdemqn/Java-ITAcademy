package com.gmail.mrdemqnvip.oop.oop_bank_cards;


public class PlatCard extends BankCard {
    @Override
    public void typeCard() {
        System.out.println("Platinum card");
    }
    @Override
    public void validity() {
        System.out.println("Validity Platinum card : 12.2023" );
    }
}
