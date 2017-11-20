package com.IsabelMont;


public class Main {
    public static int factorial(int n) {

        int r = 1;
        for (int i = 0; i < n; i++) {
            r = r * i;
        }
        return r;
    }
    public static int recursiva (int n){

        if (n > 0) {
           return factorial((n-1) * n);
        }else{
            return n; }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
