public class Pessoa {
    private int idade;
    private String nome;

    private Pessoa(String nome,int idade){
        this.idade=idade;
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                '}';
    }

    static class PessoaBuild{
        private int idade;
        private String nome;
        PessoaBuild idade(int idade){
            this.idade=idade;
            return this;
        }
        PessoaBuild nome(String string){
            this.nome=string;
            return this;
        }
        Pessoa builder(){
         return new Pessoa(nome,idade);
        }
    }


}
