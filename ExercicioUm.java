public class ExercicioUm {
    public static void executar() {
        /*  Construa um programa que leia em um vetor uma sequência de 5 números digitados 
        pelo usuário, calcule a média e apresente na tela quais valores são menores, iguais 
        ou superiores à média.  */

        int[] num = new int[5];
        int media = 0;

        for (int i = 0; i < 5; i++) {
            num[i] = Prompt.lerInteiro("Digite seu número: ");
            media += num[i];
        }

        media = media /5;

        System.out.println("A média é igual a: " + media);

        for (int i = 0; i < 5; i++) {
            if (num[i] < media) {
                System.out.println(num[i] + " é abaixo da média.");
            } else if (num[i] == media) {
                System.out.println(num[i] + " é igual à média.");
            } else if (num[i] > media) {
                System.out.println(num[i] + " é maior que a média.");
            }
        }
    }
}
