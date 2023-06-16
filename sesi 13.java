import java.util.Scanner;

public class Main {
    public static int faktorial(int a) {
        if (a == 1) {
            return a;
        } else {
            return a * faktorial(a - 1);
        }
    }

    public static int pangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * pangkat(x, y - 1);
        }
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Bilangan: ");
        int bil = scanner.nextInt();
        System.out.printf("%d! = %d%n", bil, faktorial(bil));

        System.out.print("Masukkan Nilai X: ");
        int x = scanner.nextInt();
        System.out.print("Masukkan Nilai Y: ");
        int y = scanner.nextInt();
        System.out.printf("%d dipangkatkan %d = %d%n", x, y, pangkat(x, y));

        System.out.print("Masukkan Batas Deret Bilangan Fibonacci: ");
        int limit = scanner.nextInt();
        System.out.println("Deret Fibonacci:");
        for (int i = 0; i < limit; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}