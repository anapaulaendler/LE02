public class Exercicio06 {
    public static void executar() {
        /* Elabore um programa que leia um vetor com 5 notas de um aluno e um outro vetor 
        com 5 pesos e calcule a média ponderada do aluno.  
        Média ponderada = nota1 * peso1 + nota2 * peso2 + nota3 * peso3 
        peso1 + peso2 + peso3 
        Ex.: notas: 7.5, 9.2 pesos: 6, 4. Média ponderada: (7.5 * 6 + 9.2 * 4) / (6 + 4)  */

        double[] nota = new double[5];
        double[] peso = new double[5];
        double media = 0;
        double p = 0;

        for (int i = 0; i < 5; i++) {
            nota[i] = Prompt.lerDecimal("Digite sua nota " + (i + 1) + ":");
        }

        for (int i = 0; i < 5; i++) {
            peso[i] = Prompt.lerDecimal("Digite o peso da nota " + (i + 1) + ":");
        }

        for (int i = 0; i < 5; i++) {
            media += (nota[i] * peso[i]);
            p += peso[i];
        }

        System.out.printf("Sua média é de: %.2f\n", (media / p));
        Prompt.separador();

    }
}
