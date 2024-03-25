public class Exercicio02 {
    public static void executar() {
        /* Escreva um algoritmo que leia em um vetor uma sequência finita de números
        digitados pelo usuário e, logo após, mostre o número de cada posição do vetor e se
        ele é positivo, negativo ou zero.  */


        int n = Prompt.lerInteiro("Digite a quantidade de casos: ");


        int[] num = new int[n];


        for (int i = 0; i < n; i++) {
            num[i] = Prompt.lerInteiro("Digite seu número: ");
        }


        for (int i = 0; i < n; i++) {
            if (num[i] > 0) {
                System.out.println(num[i] + " é positivo!");
            } else if (num[i] < 0) {
                System.out.println(num[i] + " é negativo!");
            } else {
                System.out.println(num[i] + " é igual a zero!");
            }
        }

        Prompt.separador();
        
    }
 }


