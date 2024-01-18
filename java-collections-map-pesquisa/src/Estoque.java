import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estoque {
    private Map<Long,Produto> estoque;

    public Estoque(){
        this.estoque= new HashMap<>();
    }

    public void setEstoqueMap(long cod,String nome,double preco,int quantidade){
        estoque.put(cod,new Produto(nome,preco,quantidade));
    }
    public void exibirProdutos(){
        System.out.println(estoque);
    }

    public double calcularValorTotalEstoque(){
        double valor=0;
        if (!estoque.isEmpty()){
            for (Produto p:estoque.values()){
                valor+= p.getQuantidade()* p.getValor();
            }
        }
        return valor;
    }
    public List<Produto> obterProdutosMaiorValor(){
        List<Produto> produtos = new ArrayList<>();
        double maiorPreco = Double.MIN_VALUE;
        if (!estoque.isEmpty()){
            for (Produto p : estoque.values()){
                if (maiorPreco<=p.getValor()){
                    if (maiorPreco<p.getValor()){
                        produtos.clear();
                    }
                    produtos.add(p);
                    maiorPreco=p.getValor();
                }
            }
        }
        return produtos;
    }
    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Produto p : estoque.values()) {
            if (p.getValor() < menorPreco) {
                produtoMaisBarato = p;
                menorPreco = p.getValor();
            }
        }
        return produtoMaisBarato;
    }
    public static void main(String[] args) {
        Estoque estoque1 =new Estoque();

        estoque1.setEstoqueMap(1222,"wew",2.5,8);
        estoque1.setEstoqueMap(1722,"wew55",2.5,8);
        estoque1.setEstoqueMap(1422,"wew",8.5,7);
        estoque1.setEstoqueMap(1722,"wew",5.5,9);
        estoque1.setEstoqueMap(1272,"wew",8.5,2);
        estoque1.setEstoqueMap(1772,"wew",3.5,4);

        System.out.println(estoque1.obterProdutosMaiorValor());

        estoque1.exibirProdutos();

        System.out.println(estoque1.calcularValorTotalEstoque());

        System.out.println(estoque1.obterProdutoMaisBarato());
    }
}
