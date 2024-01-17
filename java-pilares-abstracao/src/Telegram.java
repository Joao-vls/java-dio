public class Telegram extends ServicoMensagem {
    @Override
    public void enviar(){
        saldo();
        System.out.println("enviar telegram");
        historico();
    }
}
