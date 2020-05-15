package String1;

/*Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

        makeAbba("Hi", "Bye") → "HiByeByeHi"
        makeAbba("Yo", "Alice") → "YoAliceAliceYo"
        makeAbba("What", "Up") → "WhatUpUpWhat"*/

class MakeAbba {
    public String makeAbba(String a, String b) {
        return (a + b) + (b + a);
    }
}

public class S2_makeAbba {
    public static void main(String[] args) {
        MakeAbba makeAbba = new MakeAbba();
        System.out.println(makeAbba.makeAbba("asd","qwe"));
    }
}
