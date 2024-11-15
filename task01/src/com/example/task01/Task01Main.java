package com.example.task01;

import java.nio.charset.StandardCharsets;

public class Task01Main {
    public static void main(String[] args) {
        codeWithNPE();
    }

    static void codeWithNPE() {
        String str = null;
        str.length();
    }
}
