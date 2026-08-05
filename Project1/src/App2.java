import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number1, number2, sum;

        System.out.print("Insira dois valores: \n");
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();

        sum = number1 + number2;

        System.out.print("A soma é: " + sum);
        scanner.close();
    }
}
