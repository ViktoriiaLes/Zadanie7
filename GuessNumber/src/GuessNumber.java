import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Wprowadz wartosc");
            int x = input.nextInt();
            input.nextLine();
            if (x < 100) {
                System.out.println("Liczba jest za mała");
            } else if (x > 200) {
                System.out.println("Liczba jest za duża");
            } else if (x % 3 != 0) {
                System.out.println("Liczba jest nie podzielna przez 3");
            } else {
                System.out.println("Bingo!");
                return;
            }
        }
    }
}
