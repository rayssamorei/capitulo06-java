import java.util.Scanner;

/*/**Uma escola deseja saber se existem alunos cursando, simultaneamente, as disciplinas Lógica e Linguagem de
Programação. Coloque os números das matrículas dos alunos que cursam Lógica em um vetor, quinze alunos.
Coloque os números das matrículas dos alunos que cursam Linguagem de Programação em outro vetor, dez alunos. Mostre o número das matrículas que aparecem nos dois vetores. */
public class Atividade05 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int[] matriculasLogica = new int[15];
        int[] matriculasLinguagem = new int[10];

        System.out.println("Informe as matriculas dos alunos que cursam Lógica de programação.");
        for (int i = 0; i < 15; i++) {
            System.out.print("Insira o número da matricula de lógica " +(i + 1)+ ": ");
            matriculasLogica[i] = entrada.nextInt();
        }

        System.out.println("Informe as matriculas dos alunos que cursam Linguagem de programação:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Matricula de linguagem de programação "+(i + 1)+ "º: ");
            matriculasLinguagem[i] = entrada.nextInt();
        }

        System.out.println("Matriculas que estão em ambos os vetores: ");
        for (int i = 0; i < matriculasLogica.length; i++) {
            for(int j = 0; j < matriculasLinguagem.length; j++){
                if (matriculasLinguagem[j] == matriculasLogica[i]) {
                System.out.println("Matricula " + (i + 1));
                }
            }
        }
        entrada.close();
    }
}
