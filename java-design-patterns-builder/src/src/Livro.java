package src;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    private Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ano=" + ano +
                '}';
    }
    public static class LivroBuilder {
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
        public Livro criaLivro(){
            return new Livro(titulo,autor,ano);
        }

    }

}
