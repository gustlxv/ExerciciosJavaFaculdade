package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio16 {
    public static void main(String[] args){
        double valorCompra = 250.00;
        double valorFinal;

        if (valorCompra >= 200) {
            valorFinal = valorCompra - (valorCompra * 0.10);
            System.out.println("Valor final: R$ " + valorFinal);
        } else {
            System.out.println("Valor original: R$ " + valorCompra);
        }
    }
}
