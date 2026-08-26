package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio33 {
    public static void main(String[] args){
        float nota = 8.5f;

        String resultado = nota >= 7
                ? "Aprovado"
                : "Reprovado";

        System.out.println(resultado);
    }
}
