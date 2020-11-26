package mypackage;

import java.util.Random;

public class Math5 {
    public static void main(String[] args) {
        int b=0;
        for(int i=2;i<=50000;i++){
            String s=String.valueOf(i);
            if(s.indexOf('2')!=-1){
                b++;
            }
        }
        System.out.println("Всего бракованных табличек - "+b);


        System.out.println();
        int d=0;
        for(int i=2;i<=100000;i++){
            String s=String.valueOf(i);
            if(s.indexOf('4')!=-1){
                d++;
            }
            else if(s.indexOf('1')!=-1&s.indexOf('1')+1==s.indexOf('3')){
                d++;
            }
        }
        System.out.println("Всего исключено номеров - "+d);

        int b1=0;
        int[] Mas = new int[15];
        for(int i=0;i<Mas.length;i++){
            Random rnd=new Random();
            Mas[i]=rnd.nextInt(10);
            System.out.print(Mas[i] +" ");
            if(Mas[i]>0&Mas[i]%2==0)b1++;
        }
        System.out.println(" ");
        System.out.println("Всего в массиве "+b1+" четных");
    }

}
