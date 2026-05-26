package interfaces;
public class Aluno implements Conceitos {

    private double nota;

    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }

    public void classificarNota(double nota) {
        if (nota >= 9.0) {
            System.out.println(EXCELENCIA);
        } else if (nota >= 7.0) {
            System.out.println(SATISFATORIO);
        } else {
            System.out.println(INSUFICIENTE);
        }
    }
}
