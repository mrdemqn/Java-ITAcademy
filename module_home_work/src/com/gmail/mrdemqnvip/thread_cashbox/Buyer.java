package com.gmail.mrdemqnvip.thread_cashbox;


public class Buyer implements Runnable {
    private CashBox cashBox;


    public void setCashBox(CashBox cashBox) {
        this.cashBox = cashBox;
    }

    @Override
    public void run() {
        try {
            if (cashBox.isOpen()) {
                cashBox.newBuyer();
            } else {
                System.out.println("Buyer: CashBox is closed");
            }
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
