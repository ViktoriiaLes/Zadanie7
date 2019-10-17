public class EvenNumbers {
    public static void main(String[] args) {
        int length = 100;
        int sum = 0;

        for (int i = 0; i <= length; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

