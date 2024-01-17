public class ServicoMensagem {
    public void enviar(){
        saldo();
        System.out.println("enviar");
        historico();
    }

    public void historico(){
        System.out.println("salvo");
    }
    protected void saldo(){
        System.out.println("saldo");
    }    
}