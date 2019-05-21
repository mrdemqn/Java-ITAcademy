package com.gmail.mrdemqnvip.thread_cashbox;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CashBox implements Runnable {
    private CashBox cashBox;
    private boolean isBusy;
    private boolean isOpen;
    private int costPurchases = new Random().nextInt(10)+1;

    private List<Integer> money;
    private List<Purchases> listPurchases;

    private String  buyerName;

    public CashBox(CashBox cashBox) {
        this.cashBox = cashBox;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
        System.out.println("BarberShop: " + (open ? "Open" : "Closed"));
    }

    public boolean isBusy() {
        return isBusy;
    }

    public Purchases takePurchases() {
        return listPurchases.remove(0);
    }
    public boolean isShopEmpty() {
        return listPurchases.isEmpty();
    }

    public void setBusy(Boolean busy) {
        isBusy = busy;
    }

    @Override
    public void run() {
        try {
            cashBox.setOpen(true);
            boolean isShopEmpty = cashBox.isShopEmpty();
            while (!isShopEmpty) {
                cashBox.chasePurchase();
                Thread.sleep(20000);
                isShopEmpty = cashBox.isShopEmpty();
            }
            cashBox.setOpen(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void takeAndAddMoneyInTheCashBox(Integer integer) {
        if (money == null) money = new ArrayList<Integer>();
        money.add(integer);
        System.out.println("Cost purchases: " + integer);
    }

    public void printMoneyAndCount() {
        System.out.println("Money in the cash box: " + money);
    }
    public void addPurchases(List<Purchases> purchasesList) {
        if (listPurchases == null) listPurchases = new ArrayList<>();
        listPurchases.addAll(purchasesList);
    }

    public void chasePurchase() {
        try {
            String cashBoxName = Thread.currentThread().getName();
            while (buyerName != null) {
                Purchases purchases = takePurchases();
                setBusy(true);
                System.out.println("CashBox: " + cashBoxName + " take " + purchases);
                System.out.println("CashBox: " + cashBoxName + " chase purchases " + buyerName);
                takeAndAddMoneyInTheCashBox(costPurchases);
                printMoneyAndCount();
                Thread.sleep(2000);

                setBusy(false);
                System.out.println("CashBox: " + cashBoxName + " chase finished " + buyerName);
                this.buyerName = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void newBuyer() {
        try {
            buyerName = Thread.currentThread().getName();
            System.out.println("CashBox: new buyer " + buyerName);

            while (this.buyerName != null) {
                Thread.sleep(2000);
                System.out.println("CashBox: buyer " + buyerName + " is waiting");
            }
            this.buyerName = buyerName;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
