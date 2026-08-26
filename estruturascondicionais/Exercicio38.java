package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio38 {
    public static void main(String[] args){
        float temperatura = 28.5f;

        String resultado = temperatura > 25
                ? "Calor"
                : "Frio";

        System.out.println(resultado);
    }
}
