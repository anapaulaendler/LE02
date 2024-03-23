public class ExercicioNove {
    public static void executar() {
        /* Elabore um programa que leia os vetores A e B de 5 elementos e gere um vetor C 
        de acordo com as seguintes regras: 
        a. Os elementos das posições pares de C são os elementos das posições pares de A; 
        b. Os elementos das posições ímpares de C são os elementos das posições ímpares de B; */

        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[10];
        int j = 0;

        for (int i = 0; i < 5; i++) {
            a[i] = Prompt.lerInteiro("Digite o valor " + (i + 1) + ":");
            if (i % 2 == 0) {
                c[j] = a[i];
                j += 2;
            }
        }

        j = 1;

        for (int i = 0; i < 5; i++) {
            b[i] = Prompt.lerInteiro("Digite o valor " + (i + 1) + ":");
            if (i % 2 != 0) {
                c[j] = b[i];
                j += 2;
            }
        }

        System.out.print("Os valores do novo vetor são: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(c[i] + ", ");
        }

        System.out.println(c[4] + ".");
        Prompt.separador();
        
    }
    }
