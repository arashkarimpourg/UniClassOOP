package com.mycompany.oopt32;

public class OOPT32 {

    public class Main {
    
    }
    public static void main(String[] args) {
        float x = 2.5f;
        float n = 10.0f;
        float sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += x * i;
        }
        System.out.println(sum / n);
    }
}

