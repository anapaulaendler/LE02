public class ExercicioDoze {
    public static void executar() {
        /* Elabore um programa que leia um vetor de 12 elementos apresente na tela o 
        produto dos elementos pares positivos (desconsiderar o zero). Exemplo: {0, 5, 8, 1, 
        -6, 4, -7, 9, 10, -14, 3, 12} = 8 * 4 * 10 * 12 = 3840 */

        int[] a = new int[12];
        int p = 1;

        for (int i = 0; i < 12; i++) {
            a[i] = Prompt.lerInteiro("Digite o valor " + (i + 1) + ":");

            if (a[i] % 2 == 0 && a[i] > 0) {
                p *= a[i];
            }
        }

        System.out.println("O produto é igual a: " + p);
        Prompt.separador();

    }
}
