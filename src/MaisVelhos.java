public class MaisVelhos {

    public static void main(String[] args) {
        String[] nome = {"Joao", "Maria", "Teresa", "Carlos", "Paulo"};
        int[] idade = {30,21,15,23,17};



        for(int i=0; i<nome.length; i++) {
            System.out.println("dado da "+ (i +1) + "a pessoa");
            System.out.println("Nome: " + nome[i]);
            System.out.println("Idade: " + idade[i]);
        }

        int maioridade = idade[0];
        int pessoaMaisvelha = 0;

        for(int i=0; i<nome.length; i++) {
           if(idade[i] > maioridade) {
               maioridade = idade[i];
               pessoaMaisvelha = i;
           }
        }
        System.out.printf("PESSOA MAIS VELHA: %s\n ", nome[pessoaMaisvelha]);
    }
}
