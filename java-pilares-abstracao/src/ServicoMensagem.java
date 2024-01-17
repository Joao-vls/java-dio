public abstract class ServicoMensagem {
    public abstract void enviar();


    protected void historico(){
        System.out.println("salvo");
    }
    protected void saldo(){
        System.out.println("saldo");
    }    
}