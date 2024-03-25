public class Exercicio03 {
    public static void executar() {
        /* Faça um programa que leia em um vetor uma sequência finita de números digitados 
        pelo usuário. Crie um segundo vetor que armazene o dobro de cada número do 
        primeiro vetor e depois apresente os valores deste vetor. */

        int n = Prompt.lerInteiro("Digite o tamanho do vetor: ");
        int[] num = new int[n];
        int[] num2 = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = Prompt.lerInteiro("Digite seu número: ");
            num2[i] = 2 * num[i];
        }

        System.out.println("Seu novo vetor tem os seguintes valores: ");
        
        for (int i = 0; i < (n - 1); i++) {
            System.out.print(num2[i] + ", ");
        }

        System.out.println(num2[n-1] + ".");
        Prompt.separador();
    }
}
