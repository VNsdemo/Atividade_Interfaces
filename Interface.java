package interfaces;
public interface Conceitos {

    String EXCELENCIA = "Parabéns, você atingiu todos os indicadores...";
    String SATISFATORIO = "Parabéns, você obteve aproveitamento satisfatório...";
    String INSUFICIENTE = "Você não atingiu o mínimo esperado para aprovação";
    void classificarNota(double nota);
}