package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio13 {
    public static void main(String[] args){
        double saldo = 500.00;
        double valorProduto = 350.90;

        if (saldo >= valorProduto) {
            System.out.println("Compra aprovada.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
