package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio24 {
    public static void main(String[] args){
        float temperatura = 28.5f;

        if (temperatura < 15) {
            System.out.println("Frio");
        } else if (temperatura <= 25) {
            System.out.println("Agradável");
        } else if (temperatura <= 35) {
            System.out.println("Quente");
        } else {
            System.out.println("Muito quente");
        }
    }
}
