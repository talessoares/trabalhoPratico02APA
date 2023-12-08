import java.math.BigInteger;
import java.util.Scanner;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {
        FibonacciModified fibonacci = new FibonacciModified();
        fibonacci.run();
    }

}

class FibonacciModified implements Runnable {

    private Logger logger = Logger.getLogger(FibonacciModified.class.getName());

    @Override
    public void run() {
        Scanner input = new Scanner(System.in);

        BigInteger primeiroTermo = input.nextBigInteger();
        BigInteger segundoTermo = input.nextBigInteger();

        BigInteger n = input.nextBigInteger();

        input.close();

        long tempoInicio = System.nanoTime();

        System.out.println(getTermoFibonacci(primeiroTermo, segundoTermo, n));

        long tempoFim = System.nanoTime();

        long duracao = tempoFim - tempoInicio;
        logger.log(Level.WARNING, "Tempo de execução: {0} ns", duracao);
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