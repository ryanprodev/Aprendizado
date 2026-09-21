package A_Fundamentos;

import java.util.Scanner;

public class Arrays {

    static void main() {
        Scanner scan = new Scanner(System.in);
        double[] notas = new double[4]; // Array
        double soma = 0;

        // 1. Pede e armazene os valores
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a "+(i+1)+"° Nota: ");
            notas[i] = scan.nextDouble();
        }

        // 2. Faz a soma dos valores no array
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        // 3. Calculando a média
        double media = soma / notas.length;
        System.out.println("Média notas: " + media);
    }
}
