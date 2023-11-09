import java.util.Scanner;

/**Faça um programa que receba o nome de cinco produtos e seus respectivos preços. Calcule e mostre:
■■ a quantidade de produtos com preço inferior a R$ 50,00;
■■ o nome dos produtos com preço entre R$ 50,00 e R$ 100,00;
■■ a média dos preços dos produtos com preço superior a R$ 100,00. */
public class Atividade16 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int qtdInferior50 = 0, soma = 0;
        String produtosEntre50e100 = " ";
        double price [] = new double [5];
        String nome [] = new String [5];

        for(int i  = 0; i < 5; i++){
            System.out.println("Informe o nome do produto: ");
            nome[i] = entrada.nextLine();
            nome[i] = entrada.nextLine();

            System.out.println("Informe o preço do(a) " + nome[i]);
            price[i] = entrada.nextDouble();

            if(price[i] < 50){
                qtdInferior50++;
            } else if (price[i] >= 50.0 && price[i] <= 100.0){
                if (!produtosEntre50e100.isEmpty()) {
                    produtosEntre50e100 += nome[i];
                    produtosEntre50e100 += " ";
                }
            }

            if(price[i] > 100){
                soma += price[i];
            }
        }

        System.out.println("A quantidade de produtos com preço inferior a R$ 50,00: " + qtdInferior50);

        System.out.println("Produtos com preço entre R$ 50,00 e R$ 100,00: " + produtosEntre50e100);

        System.out.println("Média entre os produtos superiores a R$ 100,00: " + soma/5);

        entrada.close();
    }
}
