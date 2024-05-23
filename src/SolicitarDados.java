import java.util.Scanner;

public class SolicitarDados {
    public static void main(String[] args) {
        Scanner dadosUsuarios = new Scanner(System.in);

        System.out.println("Qual é o seu nome completo?");
        String nomeUsuario = dadosUsuarios.nextLine();
        System.out.println("O seu nome é: " + nomeUsuario);

        System.out.println("Qual é a sua idade (apenas números)?");
        int idadeUsuario = dadosUsuarios.nextInt();
        dadosUsuarios.nextLine(); // Consome a quebra de linha pendente
        System.out.println("Você tem " + idadeUsuario + " anos.");

        System.out.println("Qual é a sua altura?");
        float alturaUsuario = dadosUsuarios.nextFloat();
        dadosUsuarios.nextLine();
        System.out.println("A sua altura é: " + alturaUsuario);

        System.out.println("Qual é o seu peso?");
        float pesoUsuario = dadosUsuarios.nextFloat();
        dadosUsuarios.nextLine();
        System.out.println("Você pesa: " + pesoUsuario + " quilos.");

        System.out.println("O seu nome é " + nomeUsuario + ", você tem " + idadeUsuario + " anos, " + alturaUsuario + " de altura e pesa " + pesoUsuario + " quilos.");

        System.out.println("Você é maior de idade?");
        String respostaUsuario = dadosUsuarios.nextLine();
        System.out.println("A sua resposta foi: " + respostaUsuario);

        if (idadeUsuario >= 18) {
            System.out.println("Parabéns, você é maior de idade.");
        } else {
            System.out.println("Você não é maior de idade.");
        }
    }
}
