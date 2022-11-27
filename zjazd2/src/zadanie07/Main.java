package zadanie07;

public class Main {
    public static void main(String[] args) {
        System.out.printf("normal: %d%n", factorial(4));
        System.out.printf("recursively: %d", factorialRecursive(4));
    }

    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1 ; i <= n ; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int factorialRecursive(int n) {
        if (n == 1) {
            return 1;
            }
        return n * factorialRecursive(n - 1);
    }
}


