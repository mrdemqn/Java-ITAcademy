package com.gmail.mrdemqnvip.work_with_files.task_thrity_one;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        ReadAndWrite fileReadWrite = new ReadAndWrite();
        List<String> stringList = getListOfNumbersFromFile(fileReadWrite.fRead("C:\\Work\\Java-ITAcademy\\module_home_work\\begin.txt"));
        if(stringList.size() == 0){
            System.out.println("Numbers in the file are missing ");
        } else {
            System.out.println("Numbers in the file: " + stringList);
            System.out.println("The sum of the numbers in the file: "+ sumNum(stringList));
            System.out.println("List without duplicate numbers: " + new LinkedHashSet<>(stringList));
        }
    }
    private static List<String> getListOfNumbersFromFile(String text){
        List<String> list = new ArrayList<>();
        Pattern patternNum = Pattern.compile("[-+]?\\b[\\d+.,]+\\b");
        Matcher matcherNum = patternNum.matcher(text);
        while (matcherNum.find()){
            String s = matcherNum.group();
            if(s.contains(",")){
                s = s.replaceAll(",",".");
            }
            list.add(s);
        }
        return list;
    }

    private static double sumNum (List<String> list){
        double sumNum = 0;
        if(list != null && list.size() != 0){
            for(String s:list){
                if(s != null){
                    sumNum += Double.parseDouble(s);
                }
            }
        }
        return sumNum;
    }
}
