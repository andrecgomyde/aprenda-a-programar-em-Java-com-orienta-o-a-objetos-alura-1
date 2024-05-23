import java.util.Scanner;

public class GptClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;

        // Lê números até que o usuário digite zero
        do {
            System.out.print("Digite um número (0 para sair): ");
            numero = scanner.nextInt();
            soma += numero;
        } while (numero != 0);

        // Exibe a soma dos números digitados
        System.out.println("A soma dos números digitados é: " + soma);

        // Fecha o Scanner
        scanner.close();
    }
}
