package com.gmail.mrdemqnvip.oop.oop_bank_cards;

public class PremCard extends PlatCard implements InterfBankCard{
    private float balance;

    public PremCard(String bankName, String cardNameHolder, String paymentSystem, String typeCard, String cardNumber, String validity, String codeCVV, String currency) {
        super(bankName, cardNameHolder, paymentSystem, typeCard, cardNumber, validity, codeCVV, currency);
    }

    @Override
    public void checkBalance() {
        System.out.println("The balance on the card is - " + balance + " " + getCurrency());
    }

    @Override
    public void withdrawCash(int amount) {
        if (amount <= balance) {
            System.out.println("Take money please " + "\n" +
                    "Amount of withdrawn funds is - " + amount);
            balance = balance - amount;
            System.out.println(amount + " " + getCurrency() + " war debited from the card");
        } else {
            System.out.println("Insufficient funds for this operation. Please try again.");
        }
    }

    @Override
    public void topUpTheCardBalance(int money) {
        balance = balance + money;
        System.out.println(money + " " + getCurrency() + " credited to the card");
    }

    public void incomeOnCurrentBalance(float percent) {
    balance = (balance / 100) * (100 + percent);
        System.out.println("Interest trait of current balance income is - " +
    percent + "\n" + "Balance at the and of the month considering income on current balance is - " + balance);
}
}
