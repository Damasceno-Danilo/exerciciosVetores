import java.util.Locale;

public class NumerosPares {

    public static void main(String[] args) {

        int n = 6;

        System.out.println("Quantos numeros voce vai digitar? " + n);

        int[] vetor = {8, 2, 11, 14, 13, 20};

        for (int i=0; i<n; i++) {
            System.out.println("Digite um numero: " + vetor[i]);
        }
        System.out.println();
        System.out.println("Os numeros pares sao: ");

        int pares = 0;
        for (int i=0; i<n; i++) {
            if ( vetor[i] % 2 == 0) {
                System.out.printf("%d  ", vetor[i]);
                pares++;
            }
        }


    }
}
