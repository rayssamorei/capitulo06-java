
/**
 *. Faça um programa que preencha um vetor com quinze números, determine e mostre:
■■ o maior número e a posição por ele ocupada no vetor;
■■ o menor número e a posição por ele ocupada no vetor.
 */
import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        int tam = 15;
        int[] num = new int[tam];
        int posMaior = 0, posMenor = 0;

        for (int i = 0; i < tam; i++) {
            System.out.print("Informe o " + (i + 1) + " número: ");
            num[i] = input.nextInt();
        }

        int maior = num[0];
        int menor = num[0];

        for (int i = 1; i < tam; i++) {
            if (num[i] > maior) {
                maior = num[i];
                posMaior = i;
            }

            if (num[i] < menor) {
                menor = num[i];
                posMenor = i;
            }
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("Posição do maior número no vetor: " + posMaior);
        System.out.println("Posição do menor número no vetor: " + posMenor);

        input.close();
    }
}
