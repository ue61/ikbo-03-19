package com.company.pr.hw5;

public class Main {
    public static void main(String[] args){
        System.out.println("5 zadanie");
        int res = sum(1234);
        System.out.println(res);
        System.out.println("6 zadanie");
        isPrime(13);
        System.out.println("7 zadanie");
        int n=123;
        int div = 2;
        while (n>1){
            while (n%div == 0){
                System.out.print(div + " ");
                n/=div;
            }
            div++;
        }

    }
    public static int sum(int n){
        if (n<10) return n;
        return n%10 + sum(n/10);
    }
    public static void isPrime(int num){
        int temp;
        boolean isPrime=true;
        for (int i=2; i<=num/2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.println(num + " - простое число");
        } else {
            System.out.println(num + " - составное число");
        }
    }
}
