public class Exercicio10 {
    public static void executar() {
        /* Crie um programa que leia um vetor A de 5 posições e, ao final da leitura, copie 
        os elementos de A em B de forma invertida. Ou seja, o primeiro elemento de A é o 
        último elemento de B, o segundo elemento de A é o penúltimo elemento de B, e assim 
        por diante.  */

        int[] a = new int[5];
        int[] b = new int[5];
        int j = 4;
        
        for (int i = 0; i < 5; i++) {
            a[i] = Prompt.lerInteiro("Digite o valor " + (i + 1) + ":");
            b[j] = a[i];
            j -= 1;
        }

        System.out.print("O novo vetor tem os seguintes valores: ");

        for (int i = 0; i < 4; i++) {
            System.out.print(b[i] + ", ");
        }

        System.out.println(b[4] + ".");
        Prompt.separador();
        
    }
}
