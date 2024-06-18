public class Main {
    public static void main(String[] args) {
        PessoaService pessoaService=new PessoaService(new PessoaRepositoryProxy());
        Pessoa pessoa= new Pessoa.PessoaBuild().nome("pesssoa").idade(10).builder();
pessoaService.save(pessoa);
        System.out.println(pessoaService.findById(1L));

    }
}