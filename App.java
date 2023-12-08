import java.math.BigInteger;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        FibonacciModified fibonacci = new FibonacciModified();
        fibonacci.run();
    }

}

class FibonacciModified implements Runnable {

    @Override
    public void run() {
        Scanner input = new Scanner(System.in);

        BigInteger primeiroTermo = input.nextBigInteger();
        BigInteger segundoTermo = input.nextBigInteger();

        BigInteger n = input.nextBigInteger();

        input.close();

        System.out.println(getTermoFibonacci(primeiroTermo, segundoTermo, n));
    }

    private BigInteger getTermoFibonacci(BigInteger primeiroTermo, BigInteger segundoTermo, BigInteger n) {
        BigInteger proximoTermo = BigInteger.ZERO;
        for (BigInteger i = BigInteger.valueOf(2); i.compareTo(n) < 0; i = i.add(BigInteger.ONE)) {
            proximoTermo = primeiroTermo.add(segundoTermo.multiply(segundoTermo));
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

        return proximoTermo;
    }

}