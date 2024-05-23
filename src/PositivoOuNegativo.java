import java.util.Scanner;

public class PositivoOuNegativo {

    public static void main(String[] args) {
        Scanner leitorNumeroEscolhido = new Scanner(System.in);
        System.out.println("Digite um número e descubra se ele é positivo, negativo ou zero:");
        int numeroEscolhido = leitorNumeroEscolhido.nextInt();
        System.out.println("O número escolhido é: " + numeroEscolhido);

        if (numeroEscolhido > 0) {
            System.out.println("O número " + numeroEscolhido + " é positivo.");
        } else if (numeroEscolhido < 0) {
            System.out.println("O número " + numeroEscolhido + " é negativo.");
        } else {
            System.out.println("O número escolhido é zero.");
        }
    }
}
