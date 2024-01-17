public class Carro extends Veiculo{

    public void ligar(){
        confereCombustivel();
        System.out.println("ligado");
    }
    private void confereCombustivel(){
        System.out.println("combustivel");
    }
}
