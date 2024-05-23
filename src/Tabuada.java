import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner leitorNumeroParaTabuada = new Scanner(System.in);

            System.out.println("Digite um número para exibir sua tabuada:");
            int numeroParaTabuada = leitorNumeroParaTabuada.nextInt();
            System.out.println("O número digitado é: " + numeroParaTabuada);

            for (int i = 1; i <= 10; i++) {
                int resultado = numeroParaTabuada * i;
                System.out.println(numeroParaTabuada + " x " + i + " = " + resultado);
            }
    }
}
