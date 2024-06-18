package src;

public class Usuario {
    public static void main(String[] args) {

        //Livro livro=new Livro("sss","sss",10);

       // System.out.println(livro);

        CatalogoLivro catalogoLivro=new CatalogoLivro();

        catalogoLivro.setLivroList("aa","ree",200);
        catalogoLivro.setLivroList("jj","ree",200);

        System.out.println(catalogoLivro.searchAllTitulo("aa")+" "+catalogoLivro.searchAllAno(200));


       Livro livro1= new Livro.LivroBuilder().titulo("jaaa")
               .autor("ssss")
               .ano(2000).criaLivro();

        System.out.println(livro1);

    }
}

