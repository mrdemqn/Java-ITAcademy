package com.gmail.mrdemqnvip.thread_cashbox;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CashBox cashBox = new CashBox(null);
            new Thread(new CashBox(cashBox)).start();
            new Thread(new CashBox(cashBox)).start();


        List<Purchases> initPurchases = List.of(
                new Purchases("Pasta, dishwashing detergent\n" +
                        "Chicken Breast, Buckwheat, Toothpaste,\n" +
                        "Turkey, Breadcrumbs, Stuffing, Sugar"),
                new Purchases("Bread, lemon, beans, large garbage bags\n" +
                        "apples, peas"),
                new Purchases("Sausage, oranges, millet, roasting sleeve,\n" +
                        "tangerines, corn grits, foil,\n" +
                        "pears, rye flour, baking paper,\n" +
                        "zucchini, wheat flour, sponges for dishes"),
                new Purchases("Pot cheese, white cabbage, chocolate, iron sponges,\n" +
                        "bow, greens, tea, vanilla, toilet paper,\n" +
                        "mushrooms, cinnamon, diapers"));
        cashBox.addPurchases(initPurchases);
        for (int i = 1; i <= 4; i++) {
            Buyer buyer = new Buyer();
            buyer.setCashBox(cashBox);
            new Thread(buyer, "Client " + i).start();
        }
    }
}
