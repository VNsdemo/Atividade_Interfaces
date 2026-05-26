package interfaces;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        aluno.setNota(nota);
        aluno.classificarNota(nota);
    }
}
