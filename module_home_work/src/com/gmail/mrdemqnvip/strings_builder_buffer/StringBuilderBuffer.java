package com.gmail.mrdemqnvip.strings_builder_buffer;

public class StringBuilderBuffer {

        public static double stringS(String[]arrayS) {
            String str1 = "";
            long t1 = System.nanoTime();
            for (String s:arrayS) {
                str1 = str1 + s + " ";
            }
            long t2 = System.nanoTime();
            return  (double) (t2 - t1);
        }

        public static double stringBuild(String[]arrayS) {
            StringBuilder strBuild = new StringBuilder();
        long t3 = System.nanoTime();
            for (String s:arrayS) {
                strBuild.append(s);

            }
        long t4 = System.nanoTime();
        return  (double)(t4 - t3);
    }


        public static double stringBuff(String[]arrayS) {
            StringBuffer strBuff = new StringBuffer();
            long t5 = System.nanoTime();
            for (String s:arrayS) {
                strBuff.append(s);
            }
            long t6 = System.nanoTime();
            return  (double)(t6 - t5);
        }

}
