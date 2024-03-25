public class Exercicio14 {
    public static void executar() {
    /* Faça um programa que leia um vetor de 5 elementos e, após a leitura, posicione 
    o maior elemento na última posição do vetor. Nenhum número do vetor pode ser 
    apagado ou duplicado. Apresente o vetor atualizado na tela.  */

    int[] n = new int[5];
    int maior = 0;
    int j = 0;

    for (int i = 0; i < 5; i++) {
        n[i] = Prompt.lerInteiro("Digite o valor da posição " + (i + 1) + ":");
        
        if (n[i] > maior) {
            maior = n[i];
            j = i;
        }
    }

    n[j] = n[4];
    n[4] = maior;

    System.out.print("A nova ordem de valores do vetor é: ");

    for (int i = 0; i < 4; i++) {
        System.out.print(n[i] + ", ");
    }

    System.out.println(n[4] + ".");
    Prompt.separador();
}
}
