public class Exercicio13 {
    public static void executar() {
        /* Elabore um algoritmo que receba um número n e retorne um vetor com os n 
        primeiros termos da sequência de Fibonacci. Exemplo: n = 8, vetor = {1, 1, 2, 3, 5, 8, 
        13, 21}. */

        int n = Prompt.lerInteiro("Digite o número de casos: ");
        int[] f = new int[n];

        if (n <= 0) {
            System.out.println("Sequência inválida, número de casos igual ou menor a zero.");
        }

        f[0] = 1;
        f[1] = 1;

        if (n >= 3) {
        for (int i = 2; i < n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        System.out.print("O resultado da sequência de " + n + " casos é de: ");

        for (int i = 0; i < (n - 1); i++) {
            System.out.print(f[i] + ", ");
        }

        System.out.println(f[n - 1] + ".");
        Prompt.separador();

    }
}
} 
