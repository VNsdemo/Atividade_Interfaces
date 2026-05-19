package interfaces;

import java.util.Scanner;

public class AvaliacaoAluno implements Conceitos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double nota;

        System.out.print("Digite a nota do aluno: ");
        nota = scanner.nextDouble();

        if (nota >= 9.0) {
            System.out.println(EXCELENCIA);

        } else if (nota >= 7.0) {
            System.out.println(SATISFATORIO);

        } else {
            System.out.println(INSUFICIENTE);
        }

        scanner.close();
    }
}