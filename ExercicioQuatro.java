public class ExercicioQuatro {
    public static void executar() {
        /*  Elabore um programa que leia um vetor de 5 números digitados pelo usuário e uma 
        variável de um número n qualquer, depois mostre na tela o índice dos elementos que 
        são inferiores a n. */

        int[] vetor = new int[5];
        int var = 0;
        int c = 0;

        for (int i = 0; i < 5; i++) {
            vetor[i] = Prompt.lerInteiro("Digite seu número: ");
        }

        var = Prompt.lerInteiro("Digite seu valor de referência: ");

        for (int i = 0; i < 5; i++) {
            if (vetor[i] < var) {
                c += 1;
            }
        }

        System.out.println("A quantidade valores menores que " + var + " é: " + c);
        Prompt.separador();
        
    }
}
