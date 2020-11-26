package mypackage;

import java.util.Scanner;

public class Math2 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 1000; i <= 1015; i += 3) {
            System.out.print(i + " ");
        }


        System.out.println();
        for(int a=1, b=1;a<=10;a++,b=b+2){
            System.out.print(b+" ");
        }

        System.out.println();
        for(int i = 30; i >=0; i -= 5){
            System.out.print(i + " ");
        }

        System.out.println();
        for (int a = 1, b = 1; a <= 5; a++, b = b * 2) {
            System.out.print(b + " ");
        }

        System.out.println();
        for (int a = 2; a <=10000; a = 2 * a - 1) {
            System.out.print(a + " ");
        }

        System.out.println();
        for (int a = -166; a < 10000; a = a * 2 + 200) {
            if (a > -100 && a<100) {
                System.out.print(a + " ");
            }
        }
/*
        System.out.println();
        int a;
        long b=1;
        Scanner scn=new Scanner(System.in);
        System.out.println("Введите натуральное число");
        if(scn.hasNextInt()){
            a=scn.nextInt();
            for(int i=a;i>0;i--){
                b*=i;
            }
            System.out.println("Факториал числа "+a+" равен "+b);
        }
        else System.out.println("Ошибка. Введено не число");
*/
        System.out.println();

        int g = 5;
        int t = 1;
        for (int i = g; i > 0; i--) {
            t = t * i;
        }
        System.out.print(t + " ");

        System.out.println();
        int f = 4;
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        System.out.println(result);
    }





}
