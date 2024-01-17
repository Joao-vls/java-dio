public class MSNMensseger extends ServicoMensagem {
    @Override
    public void enviar(){
        saldo();
        System.out.println("enviar msn");
        historico();
    }
}
