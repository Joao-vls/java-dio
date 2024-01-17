import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaPessoas {
    private List<Pessoa>pessoas;

    public OrdenaPessoas(){
        this.pessoas= new ArrayList<>();
    }

    public void setPessoasList(String nome,int idade,double altura) {
       pessoas.add(new Pessoa(nome,idade,altura));
    }

    public List<Pessoa> ordemIdade(){
        List<Pessoa> pessoasI = new ArrayList<>(pessoas);
        Collections.sort(pessoasI);
        return pessoasI;
    }

    public List<Pessoa>ordemAltura(){
        List<Pessoa> pessoasA = new ArrayList<>(pessoas);
        Collections.sort(pessoasA,new ComparetoPorAltura());

        return  pessoasA;
    }

    public static void main(String[] args) {
        OrdenaPessoas ordenaPessoas = new OrdenaPessoas();
        ordenaPessoas.setPessoasList("jjj1",10,1.23);
        ordenaPessoas.setPessoasList("jjj2",8,1.83);
        ordenaPessoas.setPessoasList("jjj3",17,1.73);
        ordenaPessoas.setPessoasList("jjj3",15,1.13);

        System.out.println(ordenaPessoas.ordemAltura());
        System.out.println(ordenaPessoas.ordemIdade());
        System.out.println(ordenaPessoas.pessoas);
    }
}
