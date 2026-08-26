package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio29 {
    public static void main(String[] args){
        float imc = 26.5f;

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }
}
