package com.gmail.mrdemqnvip.oop.oop_bank_cards;


public class Main {
    public static void main(String[] args)  {
        BankCard platCard = new PlatCard("Alpha-Bank", "Kakhanouski Dzmitry",
                "Visa", "Platinum", "1973 1798 6544 8528", "05/23", "197", "BYN");
        platCard.cardInserted();
        platCard.checkBalance();
        platCard.topUpTheCardBalance(1500);
        platCard.checkBalance();
        platCard.withdrawCash(190);
        platCard.checkBalance();
        platCard.getCard();

        System.out.println();


        PlatCard premCard = new PremCard("Alpha-Bank", "Kakhanouski Dzmitry",
                "Master Card", "Premium", "7912 3915 3657 5419", "09/21", "379", "BYN");
        premCard.cardInserted();
        premCard.checkBalance();
        premCard.topUpTheCardBalance(1980);
        premCard.checkBalance();
        ((PremCard)premCard).incomeOnCurrentBalance(2f);
        premCard.checkBalance();
        premCard.withdrawCash(500);
        premCard.checkBalance();
        premCard.getCard();

        System.out.println();


        PremCard classCard = new ClassCard("Alpha-Bank", "Kakhanouski Dzmitry",
                "Visa", "Classic", "8254 5547 6698 3522", "05/23", "911", "BYN");
        classCard.cardInserted();
        classCard.checkBalance();
        classCard.topUpTheCardBalance(3460);
        ((ClassCard)classCard).payAndAlertSMS(255);
        classCard.withdrawCash(856);
        classCard.checkBalance();
        classCard.getCard();


    }
}
