public class ExercicioOnze {
    public static void executar() {
        /* Elabore um algoritmo que calcule o produto escalar entre dois vetores de inteiros 
        de tamanho igual a 5. Exemplo: {0, 2, 4, 6, 8}, {1, 3, 5, 7, 9} = 0*1 + 2*3 + 4*5 + 6*7 + 
        8*9 = 140 */

        int[] a = new int[5];
        int[] b = new int[5];
        int r = 0;

        for (int i = 0; i < 5; i++) {
            a[i] = Prompt.lerInteiro("Digite o valor " + (i + 1) + ":");
        }

        for (int i = 0; i < 5; i++) {
            b[i] = Prompt.lerInteiro("Digite a potência do do valor " + (i + 1) + ":");
            r += a[i] * b[i];
        }

        System.out.println("O resultado é igual a: " + r);
        Prompt.separador();
        
    }
}
