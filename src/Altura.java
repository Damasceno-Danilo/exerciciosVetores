import java.util.Locale;
import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }

        double soma = 0.0;
        double media = 0;
        for (int i = 0; i < n; i++) {
            soma += altura[i];
            media = soma / n;
        }
        System.out.printf("Altura media: " + media);

        double menores = 0.0;
        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                menores++;
            }
        }
        double pmenores =(menores /n ) *100.0;
        System.out.println();
        System.out.printf("Pessoas com menos de 16 anos:  %.1f%%%n", pmenores);

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                System.out.println(nome[i]);
            }
        }

        sc.close();

    }
}