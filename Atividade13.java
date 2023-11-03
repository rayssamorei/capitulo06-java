/**Faça um programa que receba o nome e a nota de oito alunos e mostre o relatório a seguir:
Digite o nome do 1º
aluno: Carlos
Digite a nota do Carlos: 8
Digite o nome do 2º
aluno: Pedro
Digite a nota do Pedro: 5
Relatórios de notas
Carlos 8.0
Pedro 5.0
..
..
..
Média da classe = ?? */
import java.util.Scanner;
public class Atividade13 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        String[] alunos = new String[8];
        double[] notas = new double[8];
        double somaNotas = 0,  mediaSala;

        System.out.println("Informe o nome e a nota de 8 alunos: ");

        for (int i = 0; i < 8; i++) {
            System.out.print("Informe o nome do " + (i + 1) + "º aluno: ");
            alunos[i] = input.next();
            System.out.print("Informe a nota do(a) " + alunos[i] + ": ");
            notas[i] = input.nextDouble();

            somaNotas += notas[i];
        }

        System.out.println();

        System.out.println("Relatório das notas: ");
        for (int i = 0; i < 8; i++) {
            System.out.println(alunos[i] + " " + notas[i]);
        }

        mediaSala = somaNotas / 8;

        System.out.printf("A media da sala é: %.2f" ,mediaSala);

        input.close();
    }
}
