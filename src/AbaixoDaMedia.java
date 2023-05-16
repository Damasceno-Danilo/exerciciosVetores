public class AbaixoDaMedia {

    public static void main(String[] args) {

        int n = 4;
        System.out.println("Quantos elementos vai ter o vetor?" + n);

        double[] vetor = {10.0, 15.5, 13.2, 9.8};

        for (int i=0; i<n; i++) {
            System.out.println("Digite um numero: " + vetor[i]);
        }

        double soma = 0.0;
        double media = 0.0;

        for (int i=0; i<n; i++) {
            soma += vetor[i];
            media = soma / n;
        }
        System.out.println("A soma total e: " + soma);
        System.out.println(" MEDIA DO VETOR " + media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i=0; i<n; i++) {
            if(vetor[i] < media) {
                System.out.println( vetor[i]);
            }

        }
    }
}
