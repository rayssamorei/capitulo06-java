
/**Faça um programa que preencha três vetores com dez posições cada um: o primeiro vetor, com os nomes de
dez produtos; o segundo vetor, com os códigos dos dez produtos; e o terceiro vetor, com os preços dos produtos. Mostre um relatório apenas com o nome, o código, o preço e o novo preço dos produtos que sofrerão
aumento.
Sabe-se que os produtos que sofrerão aumento são aqueles que possuem código par ou preço superior a
R$ 1.000,00. Sabe-se ainda que, para os produtos que satisfazem as duas condições anteriores, código e
preço, o aumento será de 20%; para aqueles que satisfazem apenas a condição de código, o aumento será
de 15%; e para aqueles que satisfazem apenas a condição de preço, o aumento será de 10%. */
import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        String [] nomeProduto = new String [10];
        int [] codigoProduto = new int [10];
        double  []  priceProduto = new double[10];

        double newPrice = 0;
        
        for(int i = 0; i < 10; i++) {
            System.out.println("Informe o nome do produto: ");
            nomeProduto[i] = entrada.nextLine();
            nomeProduto[i] = entrada.nextLine();
            System.out.println("Informe o código do produto: ");
            codigoProduto[i] = entrada.nextInt();
            System.out.println("Informe o preço: R$");
            priceProduto[i] = entrada.nextDouble();
        }

        for(int i = 0; i < 10; i++) {
            newPrice = priceProduto[i];

            if(codigoProduto[i] % 2 == 0) {
                newPrice *= 1.20;
            }

            if(codigoProduto[i] > 1000) {
                newPrice *= 1.10;
            }

            if(codigoProduto[i] % 2 != 0 && priceProduto[i] <= 1000) {
                newPrice *= 1.15;
            }

            if(newPrice != priceProduto[i]) {
                System.out.println(nomeProduto[i] + "\t" + codigoProduto[i] + "\t" + priceProduto[i] + "\t" + newPrice);
            }
            entrada.close();
        }
    }
}
