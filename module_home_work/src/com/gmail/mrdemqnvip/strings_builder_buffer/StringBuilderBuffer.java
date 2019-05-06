package com.gmail.mrdemqnvip.strings_builder_buffer;

public class StringBuilderBuffer {
    public static void main(String[] args) {
        String str1 = "Empty | ";
        StringBuilder strBuild = new StringBuilder("Empty | ");
        StringBuffer strBuff = new StringBuffer("Empty | ");

        long t1 = System.nanoTime();
        str1 += " Строка 'String'";
        String str2 = " String 2 ";
        String str3 = " String 3 ";
        String str123 = str1 + str2 + str3;
        long t2 = System.nanoTime();
        System.out.println(str1 + str2 + str3 + str123 +  "\n" +  "Execution time: " + (t2 - t1) + " millis");

        long t3 = System.nanoTime();
        strBuild.append(" Строка 'StringBuilder'");
        strBuild.append(" Строка 'StringBuilder'");
        strBuild.append(" Строка 'StringBuilder'");
        strBuild.append(" Строка 'StringBuilder'");
        strBuild.append(" Строка 'StringBuilder'");
        long t4 = System.nanoTime();
        System.out.println(strBuild + "\n" +  "Execution time: " + (t4 - t3) + " millis");

        long t5 = System.nanoTime();
        strBuff.append(" Строка 'StringBuffer'");
        strBuff.append(" Строка 'StringBuffer'");
        strBuff.append(" Строка 'StringBuffer'");
        strBuff.append(" Строка 'StringBuffer'");
        strBuff.append(" Строка 'StringBuffer'");
        strBuff.append(" Строка 'StringBuffer'");
        strBuff.append(" Строка 'StringBuffer'");
        strBuff.append(" Строка 'StringBuffer'");
        strBuff.append(" Строка 'StringBuffer'");
        strBuff.append(" Строка 'StringBuffer'");
        long t6 = System.nanoTime();
        System.out.println(strBuff +  "\n" +  "Execution time: " + (t6 - t5) + " millis");

        if ((t6-t5) < (t2-t1) && (t6-t5) < (t4-t3)) {
            System.out.println("The fastest way is StringBuffer. Execution speed: " + (t6-t5));
        } else {
            System.out.println("This is not the fastest way. Execution speed: " + (t6-t5));
        }
        if ((t2-t1) > (t4-t3) && (t2-t1) > (t5-t6)) {
            System.out.println("The slowest way is String. Execution speed: " + (t2-t1));
        }
        if ((t4-t3) > (t6-t5) && (t4-t3) < (t2-t1)) {
            System.out.println("The average speed way is StringBuilder. Execution speed: " + (t4-t3));
        }

    }

}
