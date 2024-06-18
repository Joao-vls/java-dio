package src;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {

    private List <Livro>livroList;

    public CatalogoLivro() {
        this.livroList = new ArrayList<>();
    }

    public void setLivroList(String titulo,String autor,int ano){
        livroList.add(new Livro.LivroBuilder().ano(ano).autor(autor).titulo(titulo).criaLivro());
    }

    public  List<Livro> searchAllAutor(String autor){
        List<Livro> livros =new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livros.add(l);
                }
            }
        }
        return livros;
    }
    public List<Livro> searchAllTitulo(String titulo){
        List<Livro>  livros = new ArrayList<>();

        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livros.add(l);
                }
            }
        }
        return livros;
    }
    public Livro searchTitulo(String titulo){
        //List<Livro>  livro = null;

        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    //livro = l;
                    return l;
                }
            }
        }
        return null;
    }
    public  List<Livro> searchAllAno(int ano){
        List<Livro> livros = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAno() == ano){
                    livros.add(l);
                }
            }
        }
        return livros;
    }
    public  List<Livro> searchIntervalAnos(int anoi, int anof){
        List<Livro> livros = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAno() >= anoi && l.getAno() <= anof){
                    livros.add(l);
                }
            }
        }
        return livros;
    }
}
