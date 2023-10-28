import java.util.Scanner;
/**
 * Faça um programa para controlar o estoque de mercadorias de uma empresa. Inicialmente,
 * o programa deverá preencher dois vetores com dez posições cada, onde o primeiro corresponde ao código do produto e o
 * segundo, ao total desse produto em estoque. Logo após, o programa deverá ler um conjunto indeterminado
 * de dados contendo o código de um cliente e o código do produto que ele deseja comprar, juntamente com a
 * quantidade. Código do cliente igual a zero indica fim do programa. O programa deverá verificar:
 * ■■ se o código do produto solicitado existe. Se existir, tentar atender ao pedido; caso contrário, exibir
 * mensagem Código inexistente;
 * ■■ cada pedido feito por um cliente só pode ser atendido integralmente. Caso isso não seja possível,
 * escrever a mensagem Não temos estoque suficiente dessa mercadoria. Se puder atendê-lo, escrever
 * a mensagem Pedido atendido. Obrigado e volte sempre;
 * ■■ efetuar a atualização do estoque somente se o pedido for atendido integralmente;
 * ■■ no final do programa, escrever os códigos dos produtos com seus respectivos estoques já atualizados.
*/

public class Atividade03{
    public static void main(String[] args) {
        int codigoProd[] = new int [10];
        int estoqueProd[] = new int [10];
        int codigoCliente = 0, codigoProdDesejado = 0, qtdProdDesejado = 0, indiceProd = 0;

        var entrada = new Scanner(System.in);
        
        for(int i = 0; i < codigoProd.length; i++){
            System.out.println("Informe o código do produto: ");
            codigoProd[i] = entrada.nextInt();
            System.out.println("Informe o total desse produto no estoque: ");
            estoqueProd[i] = entrada.nextInt();
        }

        while(true) {
            System.out.println("Informe o código do cliente (0 para encerrar): ");
            codigoCliente = entrada.nextInt();

            if (codigoCliente == 0){
                break;
            }

            for (int i = 0; i < 10; i++) {
                if (codigoProd[i] == codigoProdDesejado) {
                    indiceProd = i;
                    break;
                }
            }

            if (indiceProd == -1) {
                System.out.println("Código inexistente.");
            } else {
                if(estoqueProd[indiceProd] >= qtdProdDesejado) {
                    estoqueProd[indiceProd] -= qtdProdDesejado;
                    System.out.println("Pedido atendido. Obrigado e volte sempre.");
                } else {
                    System.out.println("Não temos estoque suficiente dessa mercadoria.");
                }
            }
        }

        System.out.println("Estoque atualizado:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Código: " + codigoProd[i] + ", Estoque: " + estoqueProd[i]);
        }

        entrada.close();

    }
}