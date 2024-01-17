public class Computador {
    public static void main(String[] args) {
        MSNMensseger msn = new MSNMensseger();
        msn.enviar();

        Facebook fb = new Facebook();
        fb.enviar();

        Telegram tl = new Telegram();
        tl.enviar();
    }
}
