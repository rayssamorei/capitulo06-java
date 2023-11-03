/**Faça um programa que receba dez números inteiros e armazene-os em um vetor. Calcule e mostre dois
vetores resultantes: o primeiro com os números pares e o segundo, com os números ímpares. */
import java.util.Scanner;
public class Atividade11 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        int[] num = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];
        int contPares = 0, contImpares = 0;

        System.out.println("Informe 10 numeros inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe " +(i + 1)+ " numero: ");
            num[i] = input.nextInt();

            if (num[i] % 2 == 0){
                pares[contPares] = num[i];
                contPares++;
            } else {
                impares[contImpares] = num[i];
                contImpares++;
            }
        }

        System.out.println("Números pares: ");
        for (int i = 0; i < contPares; i++) {
            System.out.println(pares[i] + " ");
        }

        System.out.println("Números impares: ");
        for(int i = 0; i < contImpares; i++) {
            System.out.println(impares[i] + " ");
        }

        input.close();
    }
}
