public class Amigo extends Pessoa{
    private String anivessario;

    public Amigo(String nome, int idade, String anivessario) {
        super(nome, idade);
        this.anivessario = anivessario;
    }
    public  Amigo(){}

    public String getAnivessario() {
        return anivessario;
    }

    @Override
    public String toString() {
        return "Amigo{" +
                "anivessario='" + anivessario + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public char type() {
        return 'A';
    }
}
