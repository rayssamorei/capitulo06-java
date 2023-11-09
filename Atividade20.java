/**
 *Faça um programa que leia um vetor com dez posições para números inteiros e mostre somente os números positivos
 */
import java.util.Scanner;
public class Atividade20 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        int tam = 10;
        int[] num = new int[tam];

        System.out.println("Informe 10 numeros inteiro para preneencher o vetor: ");
        for (int i = 0; i < tam; i++) {
            System.out.println("Informe o " +(i + 1)+ "º número: ");
            num[i] = input.nextInt();
        }

        System.out.println("Os numeros positivos do vetor sao: ");
        for (int i = 0; i < tam; i++) {
            if (num[i] > 0) {
                System.out.println(num[i]);
            }
        }
        input.close();
    }
}
