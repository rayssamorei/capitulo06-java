import java.util.Scanner;

/**Faça um programa que preencha um vetor com dez números reais, calcule e mostre a quantidade de números
negativos e a soma dos números positivos desse vetor. */
public class Atividade07 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        double numeros[] = new double [10];
        double qtdNegativos = 0, somaPositivos = 0;

        for(int i = 0; i < 10; i++){
            System.out.print("Informe o número " + (i+1) + "º: ");
            numeros[i] = entrada.nextDouble();

            if(numeros[i] < 0){
                qtdNegativos++;
            }
            if(numeros[i] > 0){
                somaPositivos += numeros[i];
            }
        }

        System.out.println("Quantidade de números negativos: " + qtdNegativos);
        System.out.println("Soma dos positivos: " + somaPositivos);

        entrada.close();

    }
}
