package com.gmail.mrdemqnvip.work_with_files.task_thrity_two;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        try {
            DataOutputStream dataOut = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data.dat")));
            int elem = 20;
            for (int i = 1; i <= elem; i++) {
                dataOut.writeInt(rand.nextInt(20));
            }
            dataOut.flush();
            dataOut.close();

            int size = (int) new File("data.dat").length()/4;
            List<Integer> listNum = new ArrayList<>(size);
            DataInputStream dataInput = new DataInputStream(new BufferedInputStream(new FileInputStream("data.dat")));
            for (int i = 0; i < size; i++) {
                listNum.add(dataInput.readInt());
            }
            System.out.println("List of random numbers: " + listNum);
            System.out.println("Average value of random numbers: " + average(listNum));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static double average(List<Integer> list) {
        long count = 0;
        long sum = 0;
        if (list == null || list.size() == 0) {
            return 0;
        }
        for (Integer integer : list) {
            if (integer != null) {
                sum += integer;
                count++;
            }
        }
        if (count == 0 ){
            return 0;
        }
        return (double)sum/count;
    }

}
