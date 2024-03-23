public class ExercicioQuinze {
    public static void executar() {
        /* Elabore um algoritmo que leia 5 números do teclado e preencha um vetor de 
        acordo com a seguinte regra: com exceção do 1º número, só é permitido armazenar 
        um número se ele for maior que o anterior. Ex.: se o primeiro valor lido for 5, o próximo 
        valor lido só poderá ser maior que 5. */

        int[] n = new int[5];

        n[0] = Prompt.lerInteiro("Digite o primeiro termo: ");
        int i = 1;
        int valor = 0;

        while (i < 5) {
            valor = Prompt.lerInteiro("Digite seu valor (ele precisa ser maior que o anterior!): ");
            if (valor > n[i - 1]) {
                n[i] = valor;
                i += 1;
            }
        }

        System.out.print("Os valores do seu vetor são iguais a: ");
        
        for (i = 0; i < 4; i++) {
            System.out.print(n[i] + ", ");
        }

        System.out.println(n[4] + ".");
        Prompt.separador();

    }
}
