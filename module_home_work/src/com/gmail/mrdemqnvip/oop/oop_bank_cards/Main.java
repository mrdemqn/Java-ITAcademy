package com.gmail.mrdemqnvip.oop.oop_bank_cards;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        BankCard platCard = new PlatCard();
        platCard.bankName();
        platCard.typeCard();
        platCard.validity();
        platCard.cardInserted();
        platCard.withdrawCash();
        platCard.getCard();
        System.out.println();


        PlatCard premCard = new PremCard();
        premCard.bankName();
        premCard.typeCard();
        premCard.validity();
        premCard.cardInserted();
        premCard.withdrawCash();
        premCard.getCard();
        System.out.println();


        PremCard classCard = new ClassCard();
        classCard.bankName();
        classCard.typeCard();
        classCard.validity();
        classCard.cardInserted();
        classCard.withdrawCash();
        classCard.getCard();
    }
}
