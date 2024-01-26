public class Oficina {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.ligar();
        carro.setChassi("sdsd");
        System.out.println(carro.getChassi());


        Moto moto= new Moto();
        moto.setChassi("mmmm");


        Veiculo coringa = moto;
        coringa.ligar();




    }
}
