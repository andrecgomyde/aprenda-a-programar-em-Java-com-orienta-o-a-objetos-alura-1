import java.util.Scanner;

public class NumerosDiferentes {
    public static void main(String[] args) {
        Scanner comparador = new Scanner(System.in);

        System.out.println("Escolha um número:");
        int numeroUm = comparador.nextInt();

        System.out.println("Escolha outro número:");
        int numeroDois = comparador.nextInt();

        if (numeroUm == numeroDois){
            System.out.println("Os números são iguais.");
        } else System.out.println("Os números são diferentes.");
    }
}
