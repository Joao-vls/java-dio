public class BotaoFactory {
    public static Botao getInstance(Botao botaoPrototypo) {
        Botao botao =new Botao();
        botao.setTipoBorda(botaoPrototypo.getTipoBorda());
        botao.setAltura(botaoPrototypo.getAltura());
        botao.setColor(botaoPrototypo.getColor());
        botao.setLargura(botaoPrototypo.getLargura());
        return botao;
    }
}
