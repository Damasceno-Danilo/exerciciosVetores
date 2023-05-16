public class Posicao {

    public static void main(String[] args) {

        int n = 6;

        System.out.println("Quantos numeros voce ira digitar? " + n);

        double[] posicao = {8.0, 4.0, 10.0, 14.0, 13.0, 7.0};

        for (int i=0; i<n; i++) {
            System.out.println("Digite um numero: " + posicao[i]);
        }
        double maior = posicao[0];
        int pmaior = 0;

        for (int i=0; i<n; i++) {
            if (posicao[i] > maior) {
                maior = posicao[i];
               pmaior = i;
            }
        }
        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", pmaior);

    }



}
