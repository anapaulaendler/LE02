public class ExercicioCinco {
    public static void executar() {
        /*  Elabore um programa que leia 5 números do teclado e os armazene em um vetor.
        Em seguida, leia um número n qualquer e apresente na tela a quantidade de vezes
        que o número n aparece no vetor.  */


        int[] vetor = new int[5];
        int var = 0;
        int c = 0;


        for (int i = 0; i < 5; i++) {
            vetor[i] = Prompt.lerInteiro("Digite seu número: ");
        }


        var = Prompt.lerInteiro("Digite seu valor de referência: ");


        for (int i = 0; i < 5; i++) {
            if (vetor[i] == var) {
                c += 1;
            }
        }


        System.out.println("A quantidade valores iguais a " + var + " é: " + c);
        Prompt.separador();
       
    }
}
