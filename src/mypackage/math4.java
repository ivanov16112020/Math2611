package mypackage;

public class math4 {
    public static void main(String[] args) {
        int b = 0;
        for(int i = 1001; i < 1000000; i++) {
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
        int c = 0;
        for(int i = 0; i <= 50000; i++) {
            String s = String.valueOf(i);
            if(s.indexOf("2")!=-1){
                c++;
            }
        }
        System.out.println(c);

       /* int b=0;
        for(int i=2;i<=50000;i++){
            String s=String.valueOf(i);
            if(s.indexOf('2')!=-1){
                b++;
            }
        }
        System.out.println("Всего бракованных табличек - "+b);

        */
    }
}
