import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç terimlik Fibonacci serisi istiyorsunuz? ");
        int n = scanner.nextInt();
        System.out.println("İlk " + n + " Fibonacci sayısı:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + (i < n - 1 ? ", " : "\n"));
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Temel durum: n 0 veya 1 ise, n'yi döndür
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive durum
        }
    }
}
