import java.util.Vector;
public class Estacionamento {
    private Vector<Veiculo> veiculos;
    {
        veiculos = new Vector<>();
    }

    // Adicionar veiculos
    public void adicionarVeiculos(Veiculo veiculo) throws ExcecaoRactis {
        if (veiculo.modelo.equals("Ractis")) {
            throw new ExcecaoRactis();
        } else {
            veiculos.add(veiculo);
        }
    }

    // Remover veiculos
    public void removerVeiculos(Veiculo veiculo) {
        veiculos.remove(veiculo);
    }

    // Listas veiculos
    public void listarVeiculos() {
        System.out.println("---------Veiculos------------");
        for (Veiculo v : veiculos) {
            v.detalhes();
            System.out.println("---------------------");
        }
    }

    // Getters e Setters
    public Vector<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Vector<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

}