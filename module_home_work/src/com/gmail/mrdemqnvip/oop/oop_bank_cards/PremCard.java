package com.gmail.mrdemqnvip.oop.oop_bank_cards;

public class PremCard extends PlatCard {
    @Override
    public void typeCard() {
        System.out.println("Premium card");
    }
    @Override
    public void validity() {
        System.out.println("Validity date Premium card: 08.2022" );
    }
}
