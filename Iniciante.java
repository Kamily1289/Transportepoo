public class Iniciante extends Motorista {
    public Iniciante(String nome) {
        super(nome);
    }

    @Override
    public double calcularPagamento(double valorCorrida) {
        return valorCorrida * 0.7;
    }
}
