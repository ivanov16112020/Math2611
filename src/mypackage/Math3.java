package mypackage;

public class Math3 {
    public static void main(String[] args) {

        int[] mass = new int[10];
        mass[0] = 0;
        mass[1] = 1;
        System.out.print(mass[0] + " " + mass[1] + " ");
        for (int i = 2; i < 10; ++i) {
            mass[i] = mass[i - 1] + mass[i - 2];
            System.out.print(mass[i] + " ");
        }



        System.out.println();
        int[] array = new int[20];
        array[0] = 0;
        array[1] = 1;
        System.out.print(array[0] + " " + array[1] + " ");
        for (int i = 2; i < 20; ++i) {
            array[i] = array[i - 1] + array[i - 2];
            System.out.print(array[i] + " ");
        }


        System.out.println();
        int a = 4;
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;

        }
        System.out.println(result);



        System.out.println();
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0 && i > 5) {
                System.out.print(i + " ");

            }

        }


        System.out.println();
        int b = 0;
        for(int i=9351;i<=9351;i++){
            int i1=i/100000%10,
                    i2=i/10000%10,
                    i3=i/1000%10,
                    i4=i/100%10,
                    i5=i/10%10,
                    i6=i%10;
            if((i1+i2+i3)==(i4+i5+i6)){
                b++;
            }
        }
        System.out.println(b);
        int i = 542317;
        int i1 = i/100000%10;
        System.out.println(i1);
        int i2 = i/10000%10;
        System.out.println(i2);


    }
}
