public class AgendaFactory {
    public static Pessoa getInstance(TipoPessoaEnum tipoPessoaEnum){
        return switch (tipoPessoaEnum) {
            case AMIGO -> {
                Amigo amigo = new Amigo();
                yield amigo;
            }
            case CONHECIDO -> {
                Conhecido conhecido = new Conhecido();
                yield conhecido;
            }
            default -> throw new IllegalArgumentException("inval");
        };
    }
}
