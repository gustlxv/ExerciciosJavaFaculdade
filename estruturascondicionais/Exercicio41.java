package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio41 {
    public static void main(String[] args){

        float nota = 8.5f;
        float presenca = 80.0f;

        if (nota >= 7 && presenca >= 75) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
