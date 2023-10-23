import java.util.Scanner;
/**Faça um programa que preencha um vetor com sete números inteiros, calcule e mostre:
■■ os números múltiplos de 2;
■■ os números múltiplos de 3;
■■ os números múltiplos de 2 e de 3. */
public class Atividade02 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        
        int [] numeros;
        numeros = new int [7];

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Informe um número: ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("Multiplos de 2: ");
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                System.out.println(numeros[i]);
            }
        }
        System.out.println("Multiplos de 3: ");
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 3 == 0){
                System.out.println(numeros[i]);
            }
        }
        System.out.println("Multiplos de 2 e 3: ");
        for(int i = 0; i < numeros.length; i++){
            if((numeros[i] % 2 == 0) && (numeros[i] % 3 == 0)){
                System.out.println(numeros[i]);
            }
        }
        entrada.close();

    }
}
