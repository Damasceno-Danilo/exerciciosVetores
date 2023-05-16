import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int nAlunos;
        double media = 0.0;


        System.out.print("Quantos alunos serao digitados? ");
        nAlunos =  sc.nextInt();

        String[] nomes = new String[nAlunos];
        double[] nota1 = new double[nAlunos];
        double[] nota2 = new double[nAlunos];

        for (int i=0; i<nAlunos; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + " aluno:");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Nota 1: ");
            nota1[i] = sc.nextDouble();
            System.out.print("Nota 2: ");
            nota2[i] = sc.nextDouble();
        }

        for (int i=0; i<nAlunos; i++) {
            media = (nota1[i] + nota2[i]) / 2;

            if (media >= 6.0) {
                System.out.printf("Aprovados: " + nomes[i]);
            }
        }

        sc.close();
    }
}
