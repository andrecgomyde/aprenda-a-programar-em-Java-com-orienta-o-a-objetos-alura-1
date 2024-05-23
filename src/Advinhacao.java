import java.util.Scanner;

public class Advinhacao {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int resultado = 75;
        int tentativas = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Escolha um número entre 1 e 100:");
            int numero = leitor.nextInt();
            System.out.println("Você escolheu o número: " + numero);

            if (numero != resultado){
                System.out.println("Você errou, tente novamente.");
            } else System.out.println("Parabéns, você aceretou!");
        }
    }
}
