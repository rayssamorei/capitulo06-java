
/**
 * Faça um programa que leia um vetor com quinze posições para números inteiros.
 * Depois da leitura, divida todos os seus elementos pelo maior valor do vetor.
 * Mostre o vetor após os cálculos.
 */
import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        int tam = 15;
        int[] num = new int[tam];

        System.out.println("Informe 15 números inteiros para o vetor:");
        for (int i = 0; i < tam; i++) {
            num[i] = input.nextInt();
        }

        int maxValue = num[0];

        for (int i = 1; i < tam; i++) {
            if (num[i] > maxValue) {
                maxValue = num[i];
            }
        }

        for (int i = 0; i < tam; i++) {
            num[i] /= maxValue;
        }

        System.out.println("Vetor após a divisão:");
        for (int i = 0; i < tam; i++) {
            System.out.print(num[i] + " ");
        }

        input.close();
    }
}
