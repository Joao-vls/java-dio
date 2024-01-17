package app;
public class Facebook extends ServicoMensagem{
    @Override
    public void enviar(){
        saldo();
        System.out.println("enviar facebook");
        historico();
    }
}
