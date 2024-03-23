public class ExercicioSete {
    public static void executar() {
        /* Faça um programa que leia dois vetores de 5 elementos cada e verifique se eles 
        são iguais ou não. Para serem iguais, todos os elementos dos dois vetores devem 
        coincidir.  */

        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int c = 0;

        for (int i = 0; i < 5; i++) {
            v1[i] = Prompt.lerInteiro("Digite o valor " + (i + 1) + ":");
        }

        for (int i = 0; i < 5; i++) {
            v2[i] = Prompt.lerInteiro("Digite o valor " + (i + 1) + ":");
        }

        for (int i = 0; i < 5; i++) {
            if (v1[i] == v2[i]) {
                c += 1;
            }
        }

        if (c == 5) {
            System.out.println("Os dois vetores são iguais!");
        } else {
            System.out.println("Os vetores são diferentes!");
        }

        Prompt.separador();
        
    }
}
