public class Usuario {
    public static void main(String[] args) {
        CatalogoLivro catalogoLivro = new CatalogoLivro();

        catalogoLivro.setLivroList("lol","gy",2001);
        catalogoLivro.setLivroList("lola","gma",2023);
        catalogoLivro.setLivroList("lol","gy",2002);
        catalogoLivro.setLivroList("lool","twy",1980);

        System.out.println(catalogoLivro.searchTitulo("lol"));

        System.out.println(catalogoLivro.searchTitulo("lolasd"));

        System.out.println(catalogoLivro.searchAllTitulo("lol"));

        System.out.println(catalogoLivro.searchIntervalAnos(2000,2023));


    }
}

