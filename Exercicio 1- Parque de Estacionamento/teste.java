public class teste {
    public static void main(String[] args) throws ExcecaoRactis{
        // Criação de Proprietarios
        Proprietario p1 = new Proprietario("Samuel", "12345N");
        Proprietario p2 = new Proprietario("Catia", "12345678N");
        Proprietario p3 = new Proprietario("Vasco", "123456789N");

        // Criação dos carros
        Ligeiro v1 = new Ligeiro("Ligeiro","Corola", "Toyota", "AAU-322-MC", p1, false);
        Ligeiro v2 = new Ligeiro("Ligeiro","Ractis", "Toyota", "AKU-342-MC", p2, false);
        Pesado v3 = new Pesado("Pesado","fh440", "Volvo", "AAD-325-MP", p3, 2);

        // Criação do estacionamento
        Estacionamento estacionamento = new Estacionamento();

        // Adicionar carros ao estacionamento
        estacionamento.adicionarVeiculos(v1);
        estacionamento.adicionarVeiculos(v3);
        try {
            estacionamento.adicionarVeiculos(v2);
        } catch (ExcecaoRactis e) {
            System.out.println(e.toString());
        }

        // Listar carros do estacionamento
        estacionamento.listarVeiculos();

        // Remover um carro do estacionamento
        estacionamento.removerVeiculos(v3);

        // Listas carros do estacionamento
        estacionamento.listarVeiculos();

        // Calcular custo para um veiculo
        v1.calcularCusto(2);
    }
}
