public class EmpresaTransporte {
    private List<Motorista> motoristas;

    public EmpresaTransporte() {
        motoristas = new ArrayList<>();
    }

    public void cadastrarMotorista(Motorista motorista) {
        motoristas.add(motorista);
    }

    public Motorista pesquisarMotoristaPeloNome(String nome) {
        for (Motorista m : motoristas) {
            if (m.getNome().equals(nome)) {
                return m;
            }
        }
        return null;
    }

    public void excluirMotoristaPeloNome(String nome) {
        motoristas.removeIf(m -> m.getNome().equals(nome));
    }

    public double calcularPagamentoTotal() {
        double total = 0;
        for (Motorista m : motoristas) {
            total += m.getValorArrecadado();
        }
        return total;
    }

    public void gerarRelatorioMotoristas() {
        for (Motorista m : motoristas) {
            System.out.println("Nome: " + m.getNome());
            System.out.println("Número de corridas: " + m.getNumeroDeCorridas());
            System.out.println("Valor arrecadado: " + m.getValorArrecadado());
            if (m instanceof Experiente) {
                System.out.println("Nota média: " + ((Experiente) m).getNotaMedia());
            }
            if (m instanceof Elite) {
                System.out.println("Nota média: " + ((Elite) m).getNotaMedia());
                System.out.println("Corridas premium: " + ((Elite) m).getCorridasPremium());
            }
            System.out.println();
        }
    }
}
