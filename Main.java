public class Main {
    public static void main(String[] args) {
        EmpresaTransporte empresa = new EmpresaTransporte();

        Motorista iniciante1 = new Iniciante("João");
        Motorista experiente1 = new Experiente("Maria");
        Motorista elite1 = new Elite("Pedro");
        Motorista iniciante2 = new Iniciante("Ana");
        Motorista experiente2 = new Experiente("Carlos");

        empresa.cadastrarMotorista(iniciante1);
        empresa.cadastrarMotorista(experiente1);
        empresa.cadastrarMotorista(elite1);
        empresa.cadastrarMotorista(iniciante2);
        empresa.cadastrarMotorista(experiente2);

        // Adicionar corridas
        iniciante1.addCorrida(100);
        experiente1.addCorrida(150);
        elite1.addCorrida(230);
        iniciante2.addCorrida(60);
        experiente2.addCorrida(200);

        empresa.gerarRelatorioMotoristas();

        System.out.println("Valor total a pagar: " + empresa.calcularPagamentoTotal());

        Motorista motorista = empresa.pesquisarMotoristaPeloNome("Maria");
        if (motorista != null) {
            System.out.println("Motorista encontrado: " + motorista.getNome());
        }

        empresa.excluirMotoristaPeloNome("Ana");

        System.out.println("Relatório após exclusão:");
        empresa.gerarRelatorioMotoristas();
    }
}
