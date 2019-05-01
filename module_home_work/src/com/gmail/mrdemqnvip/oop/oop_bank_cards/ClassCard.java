package com.gmail.mrdemqnvip.oop.oop_bank_cards;

public class ClassCard extends PremCard implements InterfBankCard {
    private int balance;
    public ClassCard(String bankName, String cardNameHolder, String paymentSystem, String typeCard, String cardNumber, String validity, String codeCVV, String currency) {
        super(bankName, cardNameHolder, paymentSystem, typeCard, cardNumber, validity, codeCVV, currency);
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
    public void topUpTheCardBalance(int money) {
        balance = balance + money;
        System.out.println("Replenishment was successful");
    }

    public void payAndAlertSMS(int amountMoney) {
            if (amountMoney <= balance) {
                System.out.println("You made a payment in the amount of " + amountMoney);
                balance = balance - amountMoney;
                System.out.println(amountMoney + " " + getCurrency() + " war debited from the card");
            } else {
                System.out.println("Insufficient funds for this operation. Please try again.");
            }

        }
}
