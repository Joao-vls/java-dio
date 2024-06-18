import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BotaoRegistry {
    private static BotaoRegistry botaoRegistry;
    private static Map<String,Botao> REGISTRY =new HashMap<>();

    static {
        Botao botaoAmarelo = new Botao();
        botaoAmarelo.setColor("amarelo");
        botaoAmarelo.setAltura(10);
        botaoAmarelo.setLargura(20);
        botaoAmarelo.setTipoBorda(TipoBorda.SOLID);
        REGISTRY.put("BOTAO AMARELO",botaoAmarelo);
    }

    public  static  BotaoRegistry getInstance(){
        if (Objects.isNull(botaoRegistry)){
            botaoRegistry=new BotaoRegistry();
        }
        return botaoRegistry;
    }

    public  static Botao getBotao(String cor){

        return BotaoFactory.getInstance(REGISTRY.get(cor));
    }
    public  static void addBotao(String cor,Botao botao){
        REGISTRY.put(cor,botao);
    }
}
