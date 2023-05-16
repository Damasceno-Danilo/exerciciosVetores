public class SomaVetores {

    public static void main(String[] args) {
        int n = 6;

        System.out.println("Quantos valores vai ter cada vetor? " + n);

        int[] vetorA = {8, 2, 11, 14, 13, 20};
        int[] vetorB = {5, 10, 3, 1, 10, 7};
        int[] resultado = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < n; i++) {
            System.out.println(vetorA[i]);
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < n; i++) {
            System.out.println(vetorB[i]);
        }

        System.out.println("Vetor Resultante");
        for (int i = 0; i < n; i++) {
            resultado[i] = vetorA[i] + vetorB[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(resultado[i]);
        }
    }
}
