package com.gmail.mrdemqnvip.atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;
        CashRegister cashRegister = new CashRegister(150,100,50);
        while (isTrue) {

            System.out.println("What operation do you want to perform: Put money on the card ------- [P] \n" +
                    "Withdraw money from the card ------- [W] \n" +
                    "Exit ------- [E]");
            switch (scanner.nextLine()){
                case "P":{
                    putMoneyOnCard(scanner, cashRegister);
                    break;
                }
                case "W":{
                   withdrawMoneyFromCard(scanner, cashRegister);
                    break;
                }
                case "E":{
                    System.gc();
                    System.out.println("Exit");
                    System.exit(0);
                }
            }

        }
    }

        private static void putMoneyOnCard(Scanner scanner, CashRegister cashRegister) {
        System.out.println("Choose the nomination:\n" +
                "20  BYN [20] \n" +
                "50  BYN [50] \n" +
                "100 BYN [100]");
        String nomination = scanner.nextLine();
        System.out.println("Enter amount of banknotes");
        int amount = 0;
        try {
        amount = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e){
        System.out.println("Incorrect amount of money entered. Try again");
        }
        cryAddMoney(cashRegister, nomination, amount);
        return;
        }

        private static void withdrawMoneyFromCard(Scanner scanner, CashRegister cashRegister) {
            if (cashRegister.getAmountOfNominal_50() == 0 && cashRegister.getAmountOfNominal_20() == 0 && cashRegister.getAmountOfNominal_100() == 0){
                System.out.println("Cash register is empty. Please add money");

            }
            System.out.println("Amount of banknote 100 BYN: " + cashRegister.getAmountOfNominal_100());
            System.out.println("Amount of banknote 50  BYN: " + cashRegister.getAmountOfNominal_50());
            System.out.println("Amount of banknote 20  BYN: " + cashRegister.getAmountOfNominal_20());
            System.out.println("Enter amount of money");
            int sum = 0;
            try {
                sum = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Incorrect amount of money entered. Try again");

            }
            invokeGetMoney(cashRegister, sum);
            return;
        }


        private static void cryAddMoney(CashRegister cashRegister, String nomination, int amount) {
        Banknote[] banknotes = new Banknote[amount];
        switch (nomination){
            case "20":{
                addBanknoteTwenty(banknotes, cashRegister, nomination);
                break;
            }
            case "50":{
                addBanknoteFifty(banknotes, cashRegister, nomination);
                break;
            }
            case "100":{
                addBanknoteHundred(banknotes, cashRegister, nomination);
                break;
            }
        }
    }

    private static void addBanknoteTwenty(Banknote[] banknotes, CashRegister cashRegister, String nomination) {
        for (int i = 0; i < banknotes.length; i++){
            banknotes[i] = new Banknote(20,"BYN");
        }
        if(cashRegister.addBanknoteTwenty(banknotes)){
            System.out.println("Banknotes of " +
                    nomination +
                    " BYN" +
                    " in the amount " +
                    banknotes.length +
                    " bills credited to the card");
        } else {
            System.out.println("Error, banknotes is not added");
        }
        return;
    }

    private static void addBanknoteFifty(Banknote[] banknotes, CashRegister cashRegister, String nomination) {
        for (int i = 0; i < banknotes.length ; i++){
            banknotes[i] = new Banknote(50,"BYN");
        }
        if(cashRegister.addBanknoteFifty(banknotes)){
            System.out.println("Banknotes of " +
                    nomination +
                    " BYN" +
                    " in the amount " +
                    banknotes.length +
                    " bills credited to the card");
        }else {
            System.out.println("Error, banknotes is not added");
        }
        return;
    }

    private static void addBanknoteHundred(Banknote[] banknotes, CashRegister cashRegister, String nomination) {
        for (int i = 0; i < banknotes.length; i++) {
            banknotes[i] = new Banknote(100, "BYN");
        }
        if (cashRegister.addBanknoteHundred(banknotes)) {
            System.out.println("Banknotes of " +
                    nomination +
                    " BYN" +
                    " in the amount " +
                    banknotes.length +
                    " bills credited to the card");
        } else {
            System.out.println("Error, banknotes is not added. Enter a lower number");
        }
        return;
    }


    private static void invokeGetMoney(CashRegister cashRegister, int sum) {
        if (cashRegister.getMoney(sum)){
            int[]arrayResult = cashRegister.getAmountOfBanknotes();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < arrayResult.length; i++){
                if(arrayResult[i] != 0){
                    switch (i){
                        case 0:{
                            stringBuilder.append(arrayResult[i]);
                            stringBuilder.append("x100 BYN ");
                            break;
                        }
                        case 1:{
                            stringBuilder.append(arrayResult[i]);
                            stringBuilder.append("x50 BYN ");
                            break;
                        }
                        case 2:{
                            stringBuilder.append(arrayResult[i]);
                            stringBuilder.append("x20 BYN ");
                            break;
                        }
                    }
                }
            }
            System.out.println("Operation executed successfully");
            System.out.println("You were given " + sum + " BYN");
            System.out.println("Were used denominations " + stringBuilder);
        } else {
            System.out.println("Operation failed");
        }
    }
}
