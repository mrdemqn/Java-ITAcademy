package com.gmail.mrdemqnvip.oop.oop_bank_cards;


public class PlatCard extends BankCard implements InterfBankCard {

private int balance;

    public PlatCard(String bankName, String cardNameHolder, String paymentSystem, String typeCard, String cardNumber, String validity, String codeCVV, String currency) {
        super(bankName, cardNameHolder, paymentSystem, typeCard, cardNumber, validity, codeCVV, currency);
    }


    @Override
    public void topUpTheCardBalance(int money) {
        balance = balance + money;
        System.out.println("Replenishment was successful");
    }

    @Override
    public void checkBalance() {
        System.out.println("The balance on the card is - " + balance + " " + getCurrency());
    }

    @Override
    public void withdrawCash(int amount) {
        if (amount <= balance) {
            System.out.println("Take money please. " + "\n" +
                    "Amount of withdrawn funds is - " + amount);
            balance = balance - amount;
            System.out.println(amount + " " + getCurrency() + " war debited from the card");
        } else {
            System.out.println("Insufficient funds for this operation. Please try again.");
        }
    }

    @Override
    public String toString() {
        return super.toString()+ "Balance = " + balance + " " + getCurrency();
    }
}
