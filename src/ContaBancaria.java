import java.util.Objects;
import java.util.Scanner;

public class ContaBancaria {

    private static float saldo = 0;
    private static String senha = "mudar123";
    private static final Scanner leitorDadosCliente = new Scanner(System.in);

    // Função criar conta
    public static void criarConta() {
        System.out.println("""
                Seja bem-vindo(a) ao banco!
                Vamos criar sua conta?
                Escreva 'sim' para continuar, ou 'nao' para sair:
                """);

        String resposta = leitorDadosCliente.nextLine();
        if (Objects.equals(resposta, "sim")) {
            System.out.println("""
                    Estamos felizes em ter você aqui!
                    Vamos iniciar o seu cadastro.
                    """);
        } else {
            System.out.println("O banco agradece, estamos à disposição.");
            return;
        }

        System.out.println("1. Qual é o seu nome completo?");
        String nome = leitorDadosCliente.nextLine();

        System.out.println("2. Qual é a sua data de nascimento?");
        String dataNascimento = leitorDadosCliente.nextLine();

        System.out.println("3. Qual é o seu número de CPF?");
        String cpf = leitorDadosCliente.nextLine();

        System.out.println("4. Crie uma senha:");
        senha = leitorDadosCliente.nextLine();

        System.out.println("""
                Sua conta foi criada com sucesso!
                Confira os seus dados:
                """);

        System.out.println("**********");
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Número de CPF: " + cpf);
        System.out.println("Saldo em conta: " + saldo);
        System.out.println("**********");
    }

    // Função depósito
    public static void deposito() {
        System.out.println("""
                Você deseja fazer um depósito em sua conta?
                Escreva 'sim' para continuar, ou 'nao' para sair:
                """);

        String resposta = leitorDadosCliente.nextLine();
        if (Objects.equals(resposta, "sim")) {
            System.out.println("Para realizar um depósito, complete as próximas etapas:");
        } else {
            System.out.println("Estamos à disposição.");
            return;
        }

        System.out.println("1. Qual valor você deseja depositar?");
        float valorDeposito = leitorDadosCliente.nextFloat();
        leitorDadosCliente.nextLine();

        System.out.println("2. Confira se o valor está correto: " + valorDeposito);
        System.out.println("Se o valor estiver correto, digite 'sim' para continuar, ou digite 'nao' para sair.");
        String confirmacao = leitorDadosCliente.nextLine();

        if (Objects.equals(confirmacao, "sim")) {
            validarSenha();
            saldo += valorDeposito;
            System.out.println("Depósito realizado com sucesso. O seu saldo é de: R$" + saldo);
        } else {
            System.out.println("Depósito cancelado com sucesso. O seu saldo é de: R$" + saldo);
        }
    }

    // Função transferência
    public static void transferencia() {
        System.out.println("""
                Você deseja fazer uma transferência para outra conta?
                Responda 'sim' para continuar, ou 'nao' para sair:
                """);

        String resposta = leitorDadosCliente.nextLine();
        if (Objects.equals(resposta, "sim")) {
            System.out.println("Para realizar uma transferência, complete as próximas etapas:");
        } else {
            System.out.println("Estamos à disposição.");
            return;
        }

        System.out.println("1. Para qual banco você quer transferir?");
        String bancoTransferencia = leitorDadosCliente.nextLine();

        System.out.println("2. Qual é o número da agência para transferência?");
        String agenciaTransferencia = leitorDadosCliente.nextLine();

        System.out.println("3. Qual é o número da conta para transferência?");
        String contaTransferencia = leitorDadosCliente.nextLine();

        System.out.println("4. Qual valor você deseja transferir?");
        float valorTransferencia = leitorDadosCliente.nextFloat();
        leitorDadosCliente.nextLine();

        System.out.println("5. Confira se o valor está correto: " + valorTransferencia);
        String confirmacao = leitorDadosCliente.nextLine();

        if (Objects.equals(confirmacao, "sim")) {
            validarSenha();
            if (saldo >= valorTransferencia) {
                saldo -= valorTransferencia;
                System.out.println("""
                Transferência realizada com sucesso!
                Confira o comprovante:
                """);
                System.out.println("**********");
                System.out.println("Banco: " + bancoTransferencia);
                System.out.println("Agência: " + agenciaTransferencia);
                System.out.println("Conta: " + contaTransferencia);
                System.out.println("Valor: " + valorTransferencia);
                System.out.println("**********");
            } else {
                System.out.println("Saldo insuficiente para realizar a transferência.");
            }
        } else {
            System.out.println("Transferência cancelada com sucesso. O seu saldo é de: R$" + saldo);
        }
    }

    public static void validarSenha() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Por favor, digite sua senha:");
            String senhaValidacao = leitorDadosCliente.nextLine();
            if (Objects.equals(senhaValidacao, senha)) {
                return;
            } else {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }
        System.out.println("Você excedeu o número de tentativas. A operação foi cancelada.");
        System.exit(0);
    }

    public static void main(String[] args) {
        criarConta();
        deposito();
        transferencia();
    }
}
