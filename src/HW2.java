import java.util.Scanner;

public class HW2 {
    public static int calculate(int number) {
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int ones = number % 10;
        int sum = hundreds + tens + ones;
        return sum;
    }

    public static void calculate(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        int sum = length1 + length2;
        System.out.println("Сума довжин слів " + word1 + " і " + word2 + " дорівнює " + sum);
    }

    public static boolean calculate(long number) {
        if (number > 0) {
            System.out.println("Число більше 0.");
            return true;
        } else {
            System.out.println("Число не більше 0.");
            return false;
        }
    }

    public static void main(String[] args) {
        int number = 129;
        int sum = calculate(number);
        System.out.println("Сума цифр " + number + " дорівнює " + sum);

        String word1 = "yes";
        String word2 = "no";
        calculate(word1, word2);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        long userInput = scanner.nextInt();
        boolean isPositive = calculate(userInput);
    }
}

