import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    Set<Produto> produtos;

    public CadastroProduto(){
        this.produtos=new HashSet<>();
    }

    public void adicionarProduto(int id,String nome,double preco,int quantidade){
        produtos.add(new Produto(id,nome,preco,quantidade));
    }

    public Set<Produto> exibirNome(){
        Set<Produto> produtos1 = new TreeSet<>(produtos);
        return produtos1;
    }

    public  Set<Produto> exibirPreco(){
        Set<Produto> produtos1= new TreeSet<>(new ComparetorPreco());
        produtos1.addAll(produtos);
        return produtos1;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto(1,"jo",4.2,4);
        cadastroProduto.adicionarProduto(2,"jo",2.2,7);
        cadastroProduto.adicionarProduto(4,"to",7.2,8);
        cadastroProduto.adicionarProduto(5,"yo",4.2,9);

        System.out.println(cadastroProduto.exibirNome());
        System.out.println(cadastroProduto.exibirPreco());
    }
}
