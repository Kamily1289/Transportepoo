public class Elite extends Motorista {
    private double notaMedia;
    private int corridasPremium;

    public Elite(String nome) {
        super(nome);
        this.notaMedia = 0;
        this.corridasPremium = 0;
    }

    @Override
    public double calcularPagamento(double valorCorrida) {
        double pagamento = valorCorrida * 0.8;
        if (notaMedia > 4.6) {
            pagamento += valorCorrida * 0.05;
        }
        pagamento += corridasPremium * 5.0;
        return pagamento;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void addCorridaPremium() {
        corridasPremium++;
    }

    public int getCorridasPremium() {
        return corridasPremium;
    }
}
