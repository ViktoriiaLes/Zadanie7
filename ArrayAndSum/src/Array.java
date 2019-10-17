import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int length=5;
        Scanner input = new Scanner(System.in);
        System.out.printf("Wprowadzimy %d wartosci\n",length);
        int[] array = new int[length];
        int sum = 0;

        for (int i = 0; i < length; i++) {
            getValue(input, array, i);
            if (i == 0 || i == 2 || i == 4) {
                sum += array[i];
            }
        }
        input.close();

        System.out.println("Suma " + array[0] + " + " + array[2] + " + " + array[4] + " = " + sum);
    }

    private static void getValue(Scanner input, int[] array, int i) {
        System.out.printf("Wprowadz wartosc %d:\n",i);
        array[i] = input.nextInt();
        input.nextLine();
    }
}
