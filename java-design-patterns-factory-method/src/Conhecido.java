public class Conhecido extends Pessoa{
    private  String email;

    public Conhecido(String nome, int idade, String email) {
        super(nome, idade);
        this.email = email;
    }
    public Conhecido(){}
    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return "Conhecido{" +
                "email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public char type() {
        return 'C';
    }
}
