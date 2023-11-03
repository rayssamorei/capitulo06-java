/**Faça um programa que preencha um vetor com dez números inteiros e um segundo vetor com cinco números inteiros, calcule e mostre dois vetores resultantes. O primeiro vetor resultante será composto pela
soma de cada número par do primeiro vetor somado a todos os números do segundo vetor. O segundo
vetor resultante será composto pela quantidade de divisores que cada número ímpar do primeiro vetor
tem no segundo vetor */
import java.util.Scanner;
public class Atividade10 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        int[] vetor01 = new int[10];
        System.out.println("Informe o primeiro vetor: ");
        for (int i = 0; i < vetor01.length; i++) {
            System.out.print("Informe o " +(i + 1)+ " numero: ");
            vetor01[i] = input.nextInt();
        }

        System.out.println("\n");

        int[] vetor02 = new int[5];
        System.out.println("Informe o segundo vetor: ");
        for (int i = 0; i < vetor02.length; i++) {
            System.out.print("Informe o " +(i + 1)+ " numero: ");
            vetor02[i] = input.nextInt();
        }

        int[] resultado = new int[vetor01.length];
                for (int i = 0;i < vetor01.length; i++) {
                    resultado[i] = 0;
                    if (vetor01[i] % 2 == 0) {
                        for (int j = 0; j < vetor02.length; j++) {
                            resultado[i] += vetor01[i] + vetor02[j];
                        }
                    }
                }


        int[] resultado2 = new int[vetor02.length];
                for (int i = 0; i < vetor02.length; i++) {
                    vetor02[i] = 0;
                    if (vetor02[i] % 2 != 0) {
                        for (int j = 0; j < vetor01.length; i++) {
                            if (vetor02[j] % 2 != 0 && vetor01[i] % vetor02[j] == 0) {
                                resultado2[i]++;
                            }
                        }
                    }
                }

        System.out.println("Vetor Resultante 1: Soma de números pares do primeiro vetor com todos os números do segundo vetor");
        for (int i = 0; i < resultado.length; i++) {
            System.out.println("Elemento " + i + ": " + resultado[i]);
        }

        System.out.println("Vetor Resultante 2: Quantidade de divisores de números ímpares do primeiro vetor no segundo vetor");
        for (int i = 0; i < resultado2.length; i++) {
            System.out.println("Elemento " + i + ": " + resultado2[i]);
        }

        input.close();

    }
}
