import app.Facebook;
import app.MSNMensseger;
import app.ServicoMensagem;
import app.Telegram;

public class Computador {
    public static void main(String[] args) {

        ServicoMensagem coringa = null;

        String appEscolhido = "msn";

        if (appEscolhido.equals("msn"))
            coringa = new MSNMensseger();
        else if (appEscolhido.equals("facebook"))
            coringa = new Facebook();
        else if (appEscolhido.equals("telegram"))
            coringa = new Telegram();

        coringa.enviar();
    }
}
