package com.gmail.mrdemqnvip.oop.oop_bank_cards;

public class ClassCard extends PremCard {
    @Override
    public void typeCard() {
        System.out.println("Classic card");
    }
    @Override
    public void validity() {
        System.out.println("Validity date Classic card: 09.2021" );
    }
}
