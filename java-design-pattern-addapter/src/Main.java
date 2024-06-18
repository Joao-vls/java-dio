import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        JarOperacoesContaCorrente jarOperacoes= new JarOperacoesContaCorrente();
        ClientJarOperacoesContaCorrente client=new ClientJarOperacoesContaCorrente(jarOperacoes);
        BigDecimal valoPretendido=new BigDecimal(0);

        if(client.validaSaldo(valoPretendido)){
            client.saca(valoPretendido);
        }
        JarOperacoescontaCorrenteAdapter jarAdapter= new JarOperacoescontaCorrenteAdapter();
        ClientJarOperacoesContaCorrenteAdapter clientAdapter=new ClientJarOperacoesContaCorrenteAdapter(jarAdapter);

        clientAdapter.saca(valoPretendido);
    }

}