import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long primeiroTermo = input.nextLong();
        long segundoTermo = input.nextLong();

        long n = input.nextLong();

        input.close();

        System.out.println(imprimirFibonacci(primeiroTermo, segundoTermo, n));
    }

    private static long imprimirFibonacci(long primeiroTermo, long segundoTermo, long n) {
        long proximoTermo = 0;
        for (long i = 2; i < n; i++) {
            proximoTermo = primeiroTermo + (segundoTermo * segundoTermo);
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

        return proximoTermo;
    }
}