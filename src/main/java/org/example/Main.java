package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int n) {
        if (n < 0) {
            n = -n;
        }

        String num = Integer.toString(n);
        String reversed_num = new StringBuilder(num).reverse().toString();

        return num.equals(reversed_num);
    }

    public static boolean isPerfectNumber(int n) {
        if (n <= 0) {
            return false;
        }
        int sum = 0;

        for (int i=1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
    return sum == n;

    }

    public static String numberToWords(int n) {
        if (n < 0) {
            return "Invalid Value";
        }


        String number = String.valueOf(n);
        number = number.replace("1", "One ")
                .replace("2", "Two ")
                .replace("3", "Three ")
                .replace("4", "Four ")
                .replace("5", "Five ")
                .replace("6", "Six ")
                .replace("7", "Seven ")
                .replace("8", "Eight ")
                .replace("9", "Nine ")
                .replace("0", "Zero ");

        return number.trim();
    }



}

