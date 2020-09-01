package com.company.hw1.lab;

public class Main {
    public static void main (String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int sum=0;
        int k = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
        sum = 0;
        while (k< arr.length){
            sum += arr[k];
            k++;
        }
        System.out.println(sum);
        sum = 0;
        k=0;
        do{
            sum += arr[k];
            k++;
        }while (k< arr.length);
        System.out.println(sum);
        for (int i = 0; i<args.length; i++){
            System.out.println(args[i]);
        }
        for (int i = 1; i <=10; i++){
            System.out.println("1/"+i);
        }
        int[] a = new int[10];
        for(int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random()*100);
            System.out.print(a[i] + " ");
        }
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < a.length-1; i++) {
                if(a[i] > a[i+1]){
                    isSorted = false;

                    buf = a[i];
                    a[i] = a[i+1];
                    a[i+1] = buf;
                }
            }
        }
        System.out.println("\n");
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");
        factorial(10);
    }
    static void factorial(int num){
        int factor=1;
        for (int i = 1; i <= num; i++){
            factor *= i;
        }
        System.out.println(factor);
    }
}
