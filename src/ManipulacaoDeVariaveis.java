public class ManipulacaoDeVariaveis {

    public static void main(String[] args) {

        // Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double notaUm = 8.5;
        double notaDois = 9.3;
        double notaFinal = (notaUm + notaDois) / 2;
        System.out.println("Nota número 1: " + notaUm);
        System.out.println("Nota número 2: " + notaDois);
        System.out.println("Sua nota final é: " + notaFinal + "\n");

        // Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
        double varUm = 10.5;
        int varDois = 9;
        int resultadoCasting = (int) varUm + varDois;
        System.out.println("Valor da variável número um: " + varUm);
        System.out.println("Valor da variável número dois:" + varDois);
        System.out.println("Valor da soma das váriaveis número um e dois: " + resultadoCasting + "\n");

        //Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.
        char letra = 'a';
        String frase = ". Nesta variável estamos concatenando uma variável do tipo char (letra) com uma variável do tipo string (frase).";
        System.out.println(letra + frase + "\n");

        //Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
        double precoProduto = 100.00;
        int quantidade = 100;
        double valorTotal = precoProduto * quantidade;
        System.out.println("O valor da soma de todos os produtos é: R$" + valorTotal + "\n");

        //Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
        double cambio = 4.94;
        System.out.println("Valor do câmbio: U$1.00 é equivalente a R$" + cambio);
        double saldo = 1500.5;
        System.out.println("O seu saldo é de R$" + saldo + " equivalente a U$" + (saldo / cambio) + "\n");

        //Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
        double precoOriginal = 100.0;
        double percentualDesconto = 20.0;
        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Descnto: " + percentualDesconto + "%");
        System.out.println("Preço atualizado: R$" + (precoOriginal - (percentualDesconto / 100) * precoOriginal) + "\n");
    }
}
