package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio22 {
    public static void main(String[] args){
        float nota = 8.5f;

        if (nota >= 9) {
            System.out.println("Excelente");
        } else if (nota >= 7) {
            System.out.println("Bom");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
