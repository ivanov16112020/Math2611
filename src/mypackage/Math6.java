package mypackage;

public class Math6 {
    public static void main(String[] args) {
        int[] mas2 = new int [10];
        mas2[0] = 0;
        mas2[1] = 1;
        System.out.print(mas2[0] + " " + mas2[1] + " ");
        for(int i = 2; i < 10; i++) {
            mas2[i] = mas2[i-1] + mas2[i-2];
            System.out.print(mas2[i] + " ");
        }



        System.out.println();
        int x = 5;
        int result = 1;
        for(int i = 1; i <= x; i++) {
            result *= i;
        }
        System.out.println(result);


        System.out.println();
        for(int i = 0; i <= 10; i++){
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }


    }
}
