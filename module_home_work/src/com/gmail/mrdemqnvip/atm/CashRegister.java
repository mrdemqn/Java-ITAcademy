package com.gmail.mrdemqnvip.atm;

public class CashRegister {
    private int amountOfNominal_20 = 0;
    private int amountOfNominal_50 = 0;
    private int amountOfNominal_100 = 0;
    private int[] amountOfBanknotes = new int[3];
    private Banknote[] maxAmountInATM_Banknote20;
    private Banknote[] maxAmountInATM_Banknote50;
    private Banknote[] maxAmountInATM_Banknote100;

    public CashRegister(int amountOfNominal_20, int amountOfNominal_50, int amountOfNominal_100) {
        maxAmountInATM_Banknote20 = new Banknote[amountOfNominal_20];
        maxAmountInATM_Banknote50 = new Banknote[amountOfNominal_50];
        maxAmountInATM_Banknote100 = new Banknote[amountOfNominal_100];
    }

    public int[] getAmountOfBanknotes() {
        return amountOfBanknotes;
    }

    public int getAmountOfNominal_20() {
        return amountOfNominal_20;
    }

    public int getAmountOfNominal_50() {
        return amountOfNominal_50;
    }

    public int getAmountOfNominal_100() {
        return amountOfNominal_100;
    }

    public boolean addBanknoteTwenty(Banknote[] arrayBanknote) {
        if((amountOfNominal_20 +arrayBanknote.length)> maxAmountInATM_Banknote20.length){
            return false;
        }
        addBanknote(arrayBanknote, maxAmountInATM_Banknote20);
        amountOfNominal_20 +=arrayBanknote.length;
        return true;
    }

    public boolean addBanknoteFifty(Banknote[] arrayBanknote) {
        if((amountOfNominal_50 +arrayBanknote.length)> maxAmountInATM_Banknote50.length){
            return false;
        }
        addBanknote(arrayBanknote, maxAmountInATM_Banknote50);
        amountOfNominal_50 +=arrayBanknote.length;
        return true;
    }

    public boolean addBanknoteHundred(Banknote[] arrayBanknote) {
        if((amountOfNominal_100 +arrayBanknote.length)> maxAmountInATM_Banknote100.length){
            return false;
        }
        addBanknote(arrayBanknote, maxAmountInATM_Banknote100);
        amountOfNominal_100 +=arrayBanknote.length;
        return true;
    }

    public boolean getMoney (int sum){
        if(sum>(amountOfNominal_20 *20+ amountOfNominal_50 *50+ amountOfNominal_100 *100)){
            return false;
        }
        switch (sum){
            case 10:
            case 30:
                return false;
            case 20:{
                if (amountOfNominal_20 >=1) {
                    amountOfBanknotes[2] = 1;
                    amountOfNominal_20 -=1;
                    return true;
                }
                return false;
            }
            case 40:{
                if(amountOfNominal_20 >=2){
                    amountOfBanknotes[2] = 2;
                    amountOfNominal_20 -=2;
                    return true;
                }
                return false;
            }
            case 50:{
                if(amountOfNominal_50 >=1){
                    amountOfBanknotes[1] = 1;
                    amountOfNominal_50 -=1;
                    return true;
                }
                return false;
            }
            case 60:{
                if(amountOfNominal_20 >=3){
                    amountOfBanknotes[2] = 3;
                    amountOfNominal_20 -=3;
                    return true;
                }
                return false;
            }
            case 70:{
                if(amountOfNominal_20 >=1 && amountOfNominal_50 >=1){
                    amountOfBanknotes[1] = 1;
                    amountOfBanknotes[2] = 1;
                    amountOfNominal_50 -=1;
                    amountOfNominal_20 -=1;
                    return true;
                }
                return false;
            }
            case 80:{
                if(amountOfNominal_20 >=4){
                    amountOfBanknotes[2] = 4;
                    amountOfNominal_20 -=4;
                    return true;
                }
                return false;
            }
            case 90:{
                if(amountOfNominal_20 >=2 && amountOfNominal_50 >=1){
                    amountOfBanknotes[1] = 1;
                    amountOfBanknotes[2] = 2;
                    amountOfNominal_50 -=1;
                    amountOfNominal_20 -=2;
                    return true;
                }
                return false;
            }
            case 110:{
                if(amountOfNominal_20 >=3 && amountOfNominal_50 >=1){
                    amountOfBanknotes[1] = 1;
                    amountOfBanknotes[2] = 3;
                    amountOfNominal_50 -=1;
                    amountOfNominal_20 -=3;
                    return true;
                }
                return false;
            }
            case 130:{
                if(amountOfNominal_20 >=4 && amountOfNominal_50 >=1){
                    amountOfBanknotes[1] = 1;
                    amountOfBanknotes[2] = 4;
                    amountOfNominal_50 -=1;
                    amountOfNominal_20 -=4;
                    return true;
                }
                return false;
            }
        }
        if(sum % 100 == 0){
            if (verify(sum, amountOfBanknotes)){
                return true;
            }
            return false;
        }
        if (sum % 50 == 0) {
            if(amountOfNominal_50 > 0){
                amountOfNominal_50 = amountOfNominal_50 - ((sum % 100) / 50);
                if(verify((sum - (sum % 100)), amountOfBanknotes)) {
                    amountOfBanknotes[1] = amountOfBanknotes[1] + ((sum % 100) / 50);
                    return true;
                } else {
                    amountOfNominal_50 = amountOfNominal_50 + ((sum % 100) / 50);
                }
            }
            return false;
        }
        if (sum % 20 == 0){
            if(amountOfNominal_20 < 1){
                return false;
            } else if(amountOfNominal_20 < 2 && sum % 100 > 20){
                return false;
            }else if (amountOfNominal_20 < 3 && sum%100 > 40){
                return false;
            }else if(amountOfNominal_20 < 4 && sum%100 > 60){
                return false;
            }
            amountOfNominal_20 = amountOfNominal_20 - ((sum % 100) / 20);
            if(verify((sum - (sum % 100)), amountOfBanknotes)){
                amountOfBanknotes[2] = amountOfBanknotes[2] + ((sum % 100) / 20);
                return true;
            } else {
                amountOfNominal_20 = amountOfNominal_20 + ((sum % 100) / 20);
                return false;
            }
        }
        if (sum % 50 == 20){
            if(amountOfNominal_50 < 1 || amountOfNominal_20 < 1){
                return false;
            }
            amountOfNominal_50 = amountOfNominal_50 - 1;
            amountOfNominal_20 = amountOfNominal_20 - 1;
            if(verify((sum - (sum % 100)), amountOfBanknotes)){
                amountOfBanknotes[1] = amountOfBanknotes[1] + 1;
                amountOfBanknotes[2] = amountOfBanknotes[2] + 1;
                return true;
            }else{
                amountOfNominal_50 = amountOfNominal_50 + 1;
                amountOfNominal_20 = amountOfNominal_20 + 1;
                return false;
            }
        }
        if (sum % 50 == 40){
            if(amountOfNominal_50 < 1 || amountOfNominal_20 < 2){
                return false;
            }
            amountOfNominal_50 = amountOfNominal_50 - 1;
            amountOfNominal_20 = amountOfNominal_20 - 2;
            if(verify((sum - (sum % 100)), amountOfBanknotes)){
                amountOfBanknotes[1] = amountOfBanknotes[1] + 1;
                amountOfBanknotes[2] = amountOfBanknotes[2] + 2;
                return true;
            }else {
                amountOfNominal_50 = amountOfNominal_50 + 1;
                amountOfNominal_20 = amountOfNominal_20 + 2;
                return false;
            }
        }
        if (sum % 100 == 10){
            if(amountOfNominal_50 < 1 || amountOfNominal_20 < 3){
                return false;
            }
            amountOfNominal_50 = amountOfNominal_50 - 1;
            amountOfNominal_20 = amountOfNominal_20 - 3;
            if(verify((sum - 110), amountOfBanknotes)){
                amountOfBanknotes[1] = amountOfBanknotes[1] + 1;
                amountOfBanknotes[2] = amountOfBanknotes[2] + 3;
                return true;
            } else {
                amountOfNominal_50 = amountOfNominal_50 + 1;
                amountOfNominal_20 = amountOfNominal_20 + 3;
                return false;
            }
        }
        if (sum % 100 == 30){
            if(amountOfNominal_50 < 1 || amountOfNominal_20 < 4){
                return false;
            }
            amountOfNominal_50 = amountOfNominal_50 - 1;
            amountOfNominal_50 = amountOfNominal_50 - 4;
            if(verify((sum - 130), amountOfBanknotes)){
                amountOfBanknotes[1] = amountOfBanknotes[1] + 1;
                amountOfBanknotes[2] = amountOfBanknotes[2] + 4;
                return true;
            }else {
                amountOfNominal_50 = amountOfNominal_50 + 1;
                amountOfNominal_50 = amountOfNominal_50 + 4;
                return false;
            }
        }
        return false;
    }

    private boolean verify(int sum, int [] arrayResult) {
        int amount100;
        int amount50;
        int amount20;
        amount100 = (sum / 100) / 2;
        amount50 = ((sum / 100) - amount100) + (((sum / 100) - amount100) % 2);
        amount20 = (sum - (amount50 * 50 + amount100 * 100)) / 20;

        if (amount100 <= amountOfNominal_100 && amount50 <= amountOfNominal_50 && amount20 <= amountOfNominal_20) {
            arrayResult[0] = amount100;
            arrayResult[1] = amount50;
            arrayResult[2] = amount20;
            amountOfNominal_20 = amountOfNominal_20 - amount20;
            amountOfNominal_50 = amountOfNominal_50 - amount50;
            amountOfNominal_100 = amountOfNominal_100 - amount100;
        }else if(amount100 > amountOfNominal_100){
            int diff;
            diff = amount100 - amountOfNominal_100;
            if(amount50 + 2 * diff <= amountOfNominal_50){
                if(amount20 <= amountOfNominal_20){
                    arrayResult[0] = amountOfNominal_100;
                    arrayResult[1] = (amount50 + 2 * diff);
                    arrayResult[2] = amount20;
                    amountOfNominal_20 = amountOfNominal_20 - amount20;
                    amountOfNominal_50 = amountOfNominal_50 - (amount50 + 2 * diff);
                    amountOfNominal_100 = 0;
                } else {
                    int diff2;
                    int s= amountOfNominal_20 - (amountOfNominal_20 % 5);
                    diff2 = (amount20 - s) - ((amount20 - s) % 5);
                    if ((amount50 + (int) (diff2 / 2.5)) <= amountOfNominal_50){
                        arrayResult[0] = amountOfNominal_100;
                        arrayResult[1] = (amount50 + (2 * diff) + (int)(diff2 / 2.5));
                        arrayResult[2] = s;
                        amountOfNominal_20 = amountOfNominal_20 - s;
                        amountOfNominal_50 = amountOfNominal_50 - (amount50 + (2 * diff) + (int)(diff2 / 2.5));
                        amountOfNominal_100 = 0;
                    }else{
                        return false;
                    }
                }
            }else {
                int diff1;
                diff1 = ((amount50+2*diff)- amountOfNominal_50) + (((amount50 + 2 * diff)- amountOfNominal_50) % 2);
                if (amount20 + (int)(2.5 * diff1)<= amountOfNominal_20){
                    arrayResult[0] = amountOfNominal_100;
                    arrayResult[1] = ((amount50 + 2 * diff) - diff1);
                    arrayResult[2] = (amount20 + (int)(2.5 * diff1));
                    amountOfNominal_100 = 0;
                    amountOfNominal_50 = amountOfNominal_50 -((amount50 + 2 * diff)-diff1);
                    amountOfNominal_20 = amountOfNominal_20 -(amount20 + (int)(2.5 * diff1));
                } else {
                    return false;
                }
            }
        }else if (amount50> amountOfNominal_50){
            int diff;
            diff = (amount50- amountOfNominal_50)+((amount50 - amountOfNominal_50) % 2);
            if((amount100 + (diff / 2)) <= amountOfNominal_100){
                if(amount20 <= amountOfNominal_20){
                    arrayResult[0] = (amount100 + (diff / 2));
                    arrayResult[1] = (amount50 - diff);
                    arrayResult[2] = amount20;
                    amountOfNominal_20 = amountOfNominal_20 - amount20;
                    amountOfNominal_100 = amountOfNominal_100 - (amount100 + (diff / 2));
                    amountOfNominal_50 = amountOfNominal_50 - (amount50 - diff);
                } else {
                    int diff2;
                    int s = amountOfNominal_20 - (amountOfNominal_20 % 5);
                    diff2 = (amount20 - s) - ((amount20 - s) % 5);
                    if((amount100 + (diff2 / 5)) <= amountOfNominal_100){
                        arrayResult[0] = (amount100 + (diff2 / 5) + (diff / 2));
                        arrayResult[1] = (amount50 - diff);
                        arrayResult[2] = s;
                        amountOfNominal_20 = amountOfNominal_20 - s;
                        amountOfNominal_100 = amountOfNominal_100 - (amount100 + (diff2 / 5) + (diff / 2));
                        amountOfNominal_50 = amountOfNominal_50 - (amount50 - diff);
                    } else {
                        return false;
                    }
                }
            }else {
                int diff1;
                diff1 = (amount100 + (diff / 2)) - amountOfNominal_100;
                if ((amount20 + diff1 * 5) <= amountOfNominal_20){
                    arrayResult[0] = amountOfNominal_100;
                    arrayResult[1] = (amount50 - diff);
                    arrayResult[2] = (amount20 + diff1 * 5);
                    amountOfNominal_20 = amountOfNominal_20 - (amount20 + diff1 * 5);
                    amountOfNominal_50 = amountOfNominal_50 - (amount50 - diff);
                    amountOfNominal_100 = 0;
                }else{
                    return false;
                }
            }
        }else if(amount20 > amountOfNominal_20){
            int diff;
            int s = amountOfNominal_20 - (amountOfNominal_20 % 5);
            diff = (amount20 - s) - ((amount20 - s) % 5);
            if((amount100 + (diff / 5)) <= amountOfNominal_100){
                arrayResult[0] = (amount100 + (diff / 5));
                arrayResult[1] = amount50;
                arrayResult[2] = s;
                amountOfNominal_20 = amountOfNominal_20 - s;
                amountOfNominal_100 = amountOfNominal_100 - (amount100 + (diff / 5));
                amountOfNominal_50 = amountOfNominal_50 - amount50;
            }else {
                int diff1;
                diff1 = (amount100 + (diff / 5)) - amountOfNominal_100;
                if ((amount50 + diff1 * 2) <= amountOfNominal_50){
                    arrayResult[0] = amountOfNominal_100;
                    arrayResult[1] = (amount50 + diff1 * 2);
                    arrayResult[2] = s;
                    amountOfNominal_20 = amountOfNominal_20 - s;
                    amountOfNominal_50 = amountOfNominal_50 - (amount50 + diff1 * 2);
                    amountOfNominal_100 = 0;
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    private void addBanknote(Banknote arrayBanknote[], Banknote []containerBanknote) {
        int count = 0;
        for (int i = 0; i < containerBanknote.length; i++) {
            if(containerBanknote[i] == null && count < arrayBanknote.length){
                containerBanknote[i] = arrayBanknote[count++];
            }
        }

    }

}
