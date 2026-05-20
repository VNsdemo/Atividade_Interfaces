package interfaces;

public void classificarNota{
     if (nota >= 9.0) {
            System.out.println(EXCELENCIA);

        } else if (nota >= 7.0) {
            System.out.println(SATISFATORIO);

        } else {
            System.out.println(INSUFICIENTE);
        }

public interface Conceitos {

    String EXCELENCIA = "Parabéns, você atingiu todos os indicadores de avaliação com excelência";
    String SATISFATORIO = "Parabéns, você obteve aproveitamento satisfatório nos indicadores de avaliação";
    String INSUFICIENTE = "Você não atingiu o mínimo esperado para aprovação";
}