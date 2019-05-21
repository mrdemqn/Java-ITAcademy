package com.gmail.mrdemqnvip.strings_builder_buffer;

public class Main {
    public static void main(String[] args) {
        String text = "This year Belarus celebrated not just the Day of the Diplomatic Workers, but the 100th anniversary of its diplomatic service! The report in the Minsk newspaper Zvezda of 22 January 1919 about the beginning of  the Commissariat of Foreign Affairs of the SSRB activities in Minsk was taken as a starting point of the latest history of Belarusian diplomacy.\n" +
                "At the same time, the history of Belarusian diplomacy itself, of course, has much deeper roots, since the Belarusian lands already had external relations during the Polotsk principality.\n" +
                "The era of the Grand Duchy of Lithuania and the period of The Polish–Lithuanian Commonwealth deserve of course special attention. Many of our compatriots also contributed to the development of the diplomatic service of the Russian Empire and the Soviet Union.\n";
        String [] arrayS = text.split(" ");
        System.out.println("The fastest way is StringBuffer. Execution speed: " + StringBuilderBuffer.stringS(arrayS) + " nano mills");
        System.out.println("The average speed way is StringBuilder. Execution speed: " + (StringBuilderBuffer.stringBuild(arrayS) + " nano mills"));
        System.out.println("The slowest way is String. Execution speed: " + (StringBuilderBuffer.stringS(arrayS) + " nano mills"));

    }
}
