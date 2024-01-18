import java.util.Objects;

public class Agenda {

    private String nome;
    private int numero;
    public Agenda(String nome,int numero) {
        this.nome = nome;
        this.numero=numero;
    }


    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Agenda agenda)) return false;
        return getNumero() == agenda.getNumero();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumero());
    }
}
