package com.gmail.mrdemqnvip.oop.oop_bank_cards;


import java.text.SimpleDateFormat;

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




//    Map properties = new HashMap();
//
//    public BankCard (String bankName) {
//        properties.put("brandName", bankName);
//    }
//
//    public String getBankName() {
//        return (String)properties.get("brandName");
//    }
//
//    public String getTypeCard() {
//        return (String)properties.get("typeCard");
//    }
//
//    public Date getValidity() {
//        return (Date) properties.get("validity");
//    }
//
//    public void setTypeCard(String typeCard) {
//        properties.put("typeCard", typeCard);
//    }
//
//    public void setValidity(Date validity) {
//        properties.put("validity", validity);
//    }
