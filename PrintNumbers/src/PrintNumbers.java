public class PrintNumbers {
    public static void main(String[] args) {
        double x = 0;
        while (x <=3.0) {
            System.out.printf("%f(%s), ", x,x <=3.0);
            x += 0.1;
        }
        System.out.printf("%f(%s), ", x,(double)x <=(double)3.000000);
        System.out.println();
        for (x=0.0; x<=3.0; x+=0.1) {
            System.out.printf("%f, ", x);
        }
    }
}
