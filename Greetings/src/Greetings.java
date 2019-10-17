import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        int length = 5;
        Scanner input = new Scanner(System.in);
        String[] name = new String[length];

        for (int i = 0; i < length; i++) {
            getName(input, name, i);
        }
        input.close();
        int i = length - 1;
        while (i >= 0) {
            System.out.println("Cześć " + name[i]);
            i--;
        }
    }

    private static void getName(Scanner input, String[] name, int i) {
        System.out.println("Wprowadz imię");
        name[i] = input.nextLine();
    }
}
