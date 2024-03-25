public class Exercicio08 {
    public static void executar() {
        /*  Dados dois vetores A e B de 5 elementos cada, criar um vetor C que representa a 
        concatenação de A e B, ou seja, C contém os elementos de A seguidos dos elementos 
        de B. */

        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[10];

        for (int i = 0; i < 5; i++) {
            a[i] = Prompt.lerInteiro("Digite o valor " + (i + 1) + ":");
            c[i] = a[i];
        }

        for (int i = 0; i < 5; i++) {
            b[i] = Prompt.lerInteiro("Digite o valor " + (i + 1) + ":");
            c[i + 5] = b[i];
        }

        System.out.print("Os valores do novo vetor são: ");
        for (int i = 0; i < 9; i++) {
            System.out.print(c[i] + ", ");
        }

        System.out.println(c[9] + ".");
        Prompt.separador();
        
    }
}
