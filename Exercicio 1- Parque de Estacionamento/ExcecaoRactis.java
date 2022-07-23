public class ExcecaoRactis extends Exception {
    public ExcecaoRactis(){
        super();
    }

    @Override
    public String toString() {
        return "Nao sao permitidos veiculos do modelo Ractis";
    }
    
}
