package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {

    }

    static String getSeason(int monthNumber) {
        if ((monthNumber <= 2 && monthNumber >= 1)|| monthNumber == 12){
            return "зима";
        }
        else if (monthNumber >= 3 && monthNumber <= 5){
            return "весна";
        }
        else if (monthNumber >= 6 && monthNumber <= 8){
            return "лето";
        }
        else if (monthNumber >= 9 && monthNumber <= 11){
            return "осень";
        }
        throw new MyException("monthNumber " + monthNumber + " is invalid, month number should be between 1..12");
    }

}