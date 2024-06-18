import java.math.BigDecimal;

public class ClientJarOperacoesContaCorrenteAdapter {
    private  JarOperacoescontaCorrenteAdapter jocc;

    public ClientJarOperacoesContaCorrenteAdapter(JarOperacoescontaCorrenteAdapter jocc) {
        this.jocc = jocc;
    }
    
    public void saca(BigDecimal valor){
        jocc.saca(valor);
    }
    public void deposita(BigDecimal valor){
        jocc.deposita(valor);
    }
}
