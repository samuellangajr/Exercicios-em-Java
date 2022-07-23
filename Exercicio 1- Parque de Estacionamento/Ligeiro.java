public class Ligeiro extends Veiculo {

    public final static int valorPorHora = 30;
    public final static int horaGratis = 1;
    private boolean isCarrinha;

    public Ligeiro(String tipo, String modelo, String marca, String matricula, Proprietario proprietario,
            Boolean isCarrinha) {
        super(tipo, modelo, marca, matricula, proprietario);
        this.isCarrinha = isCarrinha;
    }

    //Calcular custo 
    @Override
    void calcularCusto(int hora) {
         //Calcular tempo de estacionamento
        if (hora == horaGratis) {
            System.out.println("O estacionamento foi gratis!");
        } else {
            double valorTotal = hora * valorPorHora;
            System.out.println("O valor total a pagar é de: " + valorTotal);
        }
    }

    //Mostrar detalhes do veiculo
    public void detalhes() {
        super.detalhes();
        System.out.println("É carrinha?: "+isCarrinha);
    }

    //Getters e Setters
    public boolean getIsCarrinha() {
        return isCarrinha;
    }

    public void setIsCarrinha(boolean isCarrinha) {
        this.isCarrinha = isCarrinha;
    }
}
