import java.math.BigDecimal;

public class JarOperacoescontaCorrenteAdapter {

    private boolean validarSaldo(BigDecimal valor) {
        System.out.println("validar saldo");
        return true;
    }

    public void saca(BigDecimal valor){
        if (validarSaldo(valor)) {
            System.out.println("sacando");
        }else {
            throw new IllegalArgumentException("invalido");
        }
    }

    public void deposita(BigDecimal valor){
        System.out.println("depositando");
    }
}
