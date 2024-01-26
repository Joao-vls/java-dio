public abstract class Pessoa {
    protected String nome;
    protected int idade;

    Pessoa(){

    }
    Pessoa(String nome, int idade){
        this.idade=idade;
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
    abstract public char type();
}
