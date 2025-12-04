public class Experiente extends Motorista {
    private double notaMedia;

    public Experiente(String nome) {
        super(nome);
        this.notaMedia = 0;
    }

    @Override
    public double calcularPagamento(double valorCorrida) {
        double pagamento = valorCorrida * 0.75;
        if (notaMedia > 4.6) {
            pagamento += valorCorrida * 0.05;
        }
        return pagamento;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public double getNotaMedia() {
        return notaMedia;
    }
}
