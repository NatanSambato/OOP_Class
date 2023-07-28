import java.util.Date;

public class Pessoa {
    String nome;
    Date dataNasc;
    int idade;

    public Pessoa(String nome, Date dataNasc, int idade) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
