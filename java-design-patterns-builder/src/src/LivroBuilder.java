package src;

public class LivroBuilder {
    private String titulo;
    private String autor;
    private int ano;

   public LivroBuilder titulo(String titulo){
       this.titulo=titulo;
       return this;
   }
    public LivroBuilder autor(String autor){
        this.autor=autor;
        return this;
    }
    public LivroBuilder ano(int ano){
        this.ano=ano;
        return this;
    }
//    public Livro criaLivro(){
//       //return new Livro(titulo,autor,ano);
//    }
}
