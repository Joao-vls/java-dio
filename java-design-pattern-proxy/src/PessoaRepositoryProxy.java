import java.util.logging.Logger;

public class PessoaRepositoryProxy extends PessoaRepository{
    private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());

    @Override
    public void save(Pessoa pessoa) {
        log.info("chamado iniciado");
        super.save(pessoa);
        log.info("chamado finalizado");
    }

    @Override
    public Pessoa findById(Long id) {
        log.info("chamado iniciado");
        Pessoa pessoa= super.findById(id);
        log.info("chamado finalizado ");
        return pessoa;

    }
}
