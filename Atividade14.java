/**Faça um programa que receba o nome e duas notas de seis alunos e mostre o relatório a seguir. Relatório
de notas:
■ média da classe = ?
■■ percentual de alunos aprovados = ?%
■■ percentual de alunos de exame = ?%
■■ percentual de alunos reprovados = ?%
 */
import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        String[] alunos = new String[6];
        double[] notas = new double[6];
        double[] notas02 = new double[6];
        double[] media = new double[6];
        String[] situacao = new String[6];
        double mediaSala = 0, aprovado = 0, reprovado = 0, exame = 0;
        double prctAprovado, prctExame, prctReprovado;

        System.out.println("Informe o nome e duas notas de 6 alunos e mostre um relatorio: ");

        for (int i = 0; i < 6; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            alunos[i] = input.next();
            System.out.print("Nota da primeira prova de " + alunos[i] + ": ");
            notas[i] = input.nextDouble();
            System.out.print("Nota da segunda prova de " + alunos[i] + ": ");
            notas02[i] = input.nextDouble();

            media[i] = (notas[i] + notas02[i]) / 2;
            mediaSala += media[i];

            if (media[i] >= 7) {
                situacao[i] = "Aprovado!";
                aprovado++;

            } else if (media[i] >= 4) {
                situacao[i] = "Exame!";
                exame++;

            } else {
                situacao[i] = "Reprovado!";
                reprovado++;

            }
        }

        mediaSala /= 6;

        prctAprovado = (aprovado / 6) * 100;
        prctExame = (exame / 6) * 100;
        prctReprovado = (reprovado / 6) * 100;

        System.out.println("Relatório de notas:");
        System.out.println("Aluno \tProva 1 \tProva 2 \t Media \tStiuação");
        for (int i = 0; i < 6; i++) {
            System.out.println(alunos[i] + "\t" + notas[i] + "\t" + notas02[i] + "\t" + media[i] + "\t" + situacao[i]);
        }

        System.out.println("Media da classe: " +mediaSala);
        System.out.println("percentual de alunos aprovados: " +prctAprovado+ "%");
        System.out.println("percentual de alunos de exame: " +prctExame+ "%");
        System.out.println("percentual de alunos reprovados: " +prctReprovado+ "%");

        input.close();
    }
}
