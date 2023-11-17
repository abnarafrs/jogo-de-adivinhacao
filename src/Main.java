import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        //Variável que irá gerar um número aleatório de 0 a 100:
        int numero = new Random().nextInt(100);
        int numeroDeTentativas = 5;

        for (int tentativa = 0; tentativa < 5; tentativa++) {

            int numerosRestantes = numeroDeTentativas - tentativa;

            System.out.println(String.format("Adivinhe em %s tentativas o número entre 0 e 100: ", numerosRestantes));
            Scanner adivinhacao = new Scanner(System.in);
            int tentativaCliente = adivinhacao.nextInt();

            if (tentativaCliente == numero) {
                System.out.println("Parabéns! Você adivinhou o número!");
                break;
            } else if (tentativaCliente < numero) {
                System.out.println("O número que você digitou é menor que o número correto!");
            } else if (tentativaCliente > numero) {
                System.out.println("O número que você digitou é maior que o número correto!");
            }
        }
    }
}