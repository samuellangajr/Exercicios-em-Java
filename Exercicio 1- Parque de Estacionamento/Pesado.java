public class Pesado extends Veiculo {
    public final static int valorPorHora= 50;
    public final static int desconto= 30;
    private Double tonelagem;

    public Pesado(String tipo, String modelo, String marca,String matricula, Proprietario proprietario, double tonelagem) {
        super(tipo, modelo, marca, matricula, proprietario);
        this.tonelagem = tonelagem;
    }

    //Calcular custo
    @Override
    void calcularCusto(int hora) {
        double valorTotal;
        if (hora < 1) {
            valorTotal = 30;
        } else if (hora > 5) {
            valorTotal = (hora*valorPorHora)-desconto;
        }else{
            valorTotal = hora * valorPorHora;
        }
        System.out.println("O valor total a pagar é de: " + valorTotal);
    }

    //Mostrar detalhes do veiculo
    public void detalhes() {
        super.detalhes();
        System.out.println("Tipo: Pesado");
        System.out.println("Tonelagem: " + tonelagem);
    }

    //Getters e Setters
    public Double getTonelagem() {
        return tonelagem;
    }

    public void setTonelagem(Double tonelagem) {
        this.tonelagem = tonelagem;
    }

}
