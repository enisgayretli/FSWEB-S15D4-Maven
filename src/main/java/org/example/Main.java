package org.example;


import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");

        WorkintechList list = new WorkintechList();
        list.add("Ahmet");
        list.add("Enis");
        list.add("Demir");
        list.add("Ferhan");
        list.add("Gurhan");
        list.add("Hakan");
        list.add("Beyhan");
        list.add("Cihan");
        boolean addedOrNot = list.add("Enis");
        System.out.println(addedOrNot);

        System.out.println("*******************************************");

        System.out.println(list);
        System.out.println("*******************************************");
        boolean removedOrNot = list.remove("Ziya");
        System.out.println(list);
        System.out.println("*******************************************");
        System.out.println(removedOrNot);

        //checkForPalindrome("Welcome");
    }

    public static boolean checkForPalindrome(String text){

        if(text.isEmpty())
            return false;

        String clearedStr = text.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        // wasitacaroracatisaw
        System.out.println(clearedStr);

        LinkedList<Character> charList = new LinkedList<>();

        for(char c : clearedStr.toCharArray()){
            charList.add(c);
        }

        System.out.println("**************************************");
        System.out.println(charList);

        if(charList.isEmpty())
            return false;

        charList.pollFirst();
        charList.pollLast();

        while(charList.size() > 1){

            if(!charList.pollFirst().equals(charList.pollLast()))
                return false;
        }

        return true;
    }

    public static String convertDecimalToBinary(int decimal){

        // 13 / 2 = 6, 13 % 2 = 1
        // 1
        // 6 / 2 = 3, 6 % 2 = 0
        // 0-1
        // 3 / 2 = 1, 3 % 2 = 1
        // 1-0-1
        // 1 / 2 = 0, 1 % 2 = 1
        // 1-1-0-1

        // 2 ^ 0 * 1 + 2 ^ 1 * 0 + 2 ^ 2 * 1 + 2 ^3 * 1

        LinkedList<Integer> binaryList = new LinkedList<>();

        while(decimal > 0){

            int remainder = decimal % 2;

            binaryList.addFirst(remainder);

            decimal = decimal / 2;
        }
        // 1, 1, 0, 1

        StringBuilder sb = new StringBuilder();

        for(int digit: binaryList){
            sb.append(digit);
        }

        return sb.toString();
    }
}