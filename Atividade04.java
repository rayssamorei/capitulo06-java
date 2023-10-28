import java.util.Scanner;
/**Faça um programa que preencha um vetor com quinze elementos inteiros e verifique a existência de elementos
iguais a 30, mostrando as posições em que apareceram */

public class Atividade04{
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int vetor[] = new int[15];
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe um número para o " + (i+1) + "º: ");
            vetor[i] = entrada.nextInt();
        }
        System.out.println("Posição em que os valores 30 se repetem: ");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == 30) {
                System.out.println("Posição " + (i + 1));
            }
        }

        entrada.close();
    }
}
