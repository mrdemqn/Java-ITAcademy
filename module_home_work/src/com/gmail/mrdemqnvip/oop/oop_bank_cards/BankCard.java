package com.gmail.mrdemqnvip.oop.oop_bank_cards;


public abstract class BankCard implements InterfBankCard {

    private String bankName;
    private String cardNameHolder;
    private String paymentSystem;
    private String typeCard;
    private String cardNumber;
    private String validity;
    private String codeCVV;
    private String currency;

    public BankCard(String bankName, String cardNameHolder, String paymentSystem, String typeCard, String cardNumber, String validity, String codeCVV, String currency) {
        this.bankName = bankName;
        this.cardNameHolder = cardNameHolder;
        this.paymentSystem = paymentSystem;
        this.typeCard = typeCard;
        this.cardNumber = cardNumber;
        this.validity = validity;
        this.codeCVV = codeCVV;
        this.currency = currency;
    }

    public String getBankName() {
        return bankName;
    }

    public String getCardNameHolder() {
        return cardNameHolder;
    }

    public String getPaymentSystem() {
        return paymentSystem;
    }

    public String getTypeCard() {
        return typeCard;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getValidity() {
        return validity;
    }

    public String getCodeCVV() {
        return codeCVV;
    }

    public String getCurrency() {
        return currency;
    }

    public void cardInserted () {

        System.out.println("Card inserted into ATM ");
    }

    public void getCard() {

        System.out.println("Get a card from an ATM");
    }

    @Override
    public String toString() {
        return "BankCard{" +
                "bankName='" + bankName + '\'' +
                ", cardNameHolder='" + cardNameHolder + '\'' +
                ", paymentSystem='" + paymentSystem + '\'' +
                ", typeCard='" + typeCard + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", validity='" + validity + '\'' +
                ", codeCVV='" + codeCVV + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }
}