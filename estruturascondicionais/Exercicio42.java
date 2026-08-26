package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio42 {
    public static void main(String[] args){
        double saldo = 200.00;
        double valorProduto = 350.00;
        boolean clienteVip = true;

        if (saldo >= valorProduto) {
            System.out.println("Compra aprovada");
        } else if (clienteVip) {
            System.out.println("Compra aprovada pelo crédito VIP");
        } else {
            System.out.println("Compra recusada");
        }
    }
}
