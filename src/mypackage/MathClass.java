package mypackage;

public class MathClass {

    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 0;
        array[1] = 1;
        System.out.print(array[0] + " " + array[1] + " ");
        for (int i = 2; i < 10; ++i) {
            array[i] = array[i - 1] + array[i - 2];
            System.out.print(array[i] + " ");
        }
 /*       System.out.println();
        for (int i = 0; i < 20; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();


        System.out.println();

        String str1 = "Hello!";
        String str2 = "Hello world!";
        int x = str1.length();
        int y = str2.length();
        if (x > y) {
            System.out.println(str1);
        }
        else {
            System.out.println(str2);
        }

        System.out.println();
        int[] arr = {10, 24, 55, 66, 88, 72, 64};
        for (int i = 0; i < 5; i++) {

            System.out.print(arr[i] + " ");

        }


        System.out.println();
        System.out.println("new task");



        for (int i = 2; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }


        System.out.println();


        for (int i = 2; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


        System.out.println();
        System.out.println("new task");


        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                if (i > 5) {
                    System.out.print(i + " ");
                }
            }
        }


        System.out.println();
        System.out.println("new task");

        int a = 0;
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0)a++;
        }
        int[] massive = new int[a];
        for(int i = 15, b = 0; i >= 0; i--) {
            if (i % 2 != 0) {
                massive[b] = i;
                System.out.print(massive[b] + " ");
                b++;
            }
        }
        System.out.println();
        for(int i = massive.length - 1; i >= 0; i--) {
            System.out.println(massive[i]);
        }


        System.out.println();
        System.out.println("new task");

        int[] array22 = new int[20];
        array22[0] = 1;
        array22[1] = 1;
        System.out.print(array22[0] + " " + array22[1] + " ");
        for (int i = 2; i < 20; ++i) {
            array22[i] = array22[i - 1] + array22[i - 2];
            System.out.print(array22[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }

        }

        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");;
            }

        }
*/
    }
}






