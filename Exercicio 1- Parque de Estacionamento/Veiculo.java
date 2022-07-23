public abstract class Veiculo{
    protected String tipo;
    protected String modelo;
    protected String marca;
    protected String matricula;
    protected Proprietario proprietario;
    
    public Veiculo(String tipo,String modelo, String marca, String matricula, Proprietario proprietario) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.marca = marca;
        this.matricula = matricula;
        this.proprietario = proprietario;
    }

    //Mostrar detalhes do veiculo
    public void detalhes() {
        System.out.println("Tipo: "+tipo);
        System.out.println("modelo: "+modelo);
        System.out.println("marca: "+marca);
        System.out.println("matricula: "+matricula);
        System.out.println("proprietario: "+proprietario.getNome());
    }

    //Calcular custo
    abstract void calcularCusto(int hora);
    
}
