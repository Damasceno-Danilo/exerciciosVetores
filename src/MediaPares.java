import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

    public static void main(String[] args) {

        int n;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i=0; i<n; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        int soma = 0;
        double media = 0;
        int pares = 0;

        for (int i=0; i<n; i++) {
            if ( vetor[i] % 2 == 0) {
                soma += vetor[i];
                pares++;
            }
            media = soma / vetor[i];
        }
        if (pares > 0) {
            media = (double) soma / pares;
            System.out.printf("Media dos numeros pares: %.1f%n", media);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }

    }
}
