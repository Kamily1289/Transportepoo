public abstract class Motorista {
    protected String nome;
    protected int numeroDeCorridas;
    protected double valorArrecadado;

    public Motorista(String nome) {
        this.nome = nome;
        this.numeroDeCorridas = 0;
        this.valorArrecadado = 0;
    }

    public abstract double calcularPagamento(double valorCorrida);

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public int getNumeroDeCorridas() {
        return numeroDeCorridas;
    }

    public double getValorArrecadado() {
        return valorArrecadado;
    }

    public void addCorrida(double valorCorrida) {
        numeroDeCorridas++;
        valorArrecadado += calcularPagamento(valorCorrida);
    }
}
