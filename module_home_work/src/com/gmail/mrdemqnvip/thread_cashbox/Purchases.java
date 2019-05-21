package com.gmail.mrdemqnvip.thread_cashbox;

public class Purchases {
    private String namePurchases;

    public Purchases(String namePurchases) {
        this.namePurchases = namePurchases;
    }

    @Override
    public String toString() {
        return "Purchases{" +
                "namePurchases='" + namePurchases + '\'' +
                '}';
    }
}
