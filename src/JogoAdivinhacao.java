import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;
        boolean acertou = false;

        while (tentativas < 5 && !acertou) {
            System.out.println("Digite um número entre 0 e 100:");
            int palpite = scanner.nextInt();
            tentativas++;
            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou!");
                acertou = true;
            } else if (palpite < numeroAleatorio) {
                System.out.println("O número é maior.");
            } else {
                System.out.println("O número é menor.");
            }
        }

        if (!acertou) {
            System.out.println("Você esgotou suas tentativas. O número era " + numeroAleatorio);
        }
    }
}
