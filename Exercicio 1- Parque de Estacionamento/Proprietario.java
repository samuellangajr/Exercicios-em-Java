public class Proprietario {
    private String nome;
    private String bilheteIdentidade;

    public Proprietario(String nome, String bilheteIdentidade) {
        this.nome = nome;
        this.bilheteIdentidade = bilheteIdentidade;
    }

    //Getters e Setters
    public void SetNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void SetBilheteIdentidade(String bilheteIdentidade) {
        this.bilheteIdentidade = bilheteIdentidade;
    }

    public String getBilheteIdentidade() {
        return bilheteIdentidade;
    }
}
