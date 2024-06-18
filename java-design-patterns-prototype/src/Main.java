public class Main {
    public static void main(String[] args) {
        Botao botao = BotaoRegistry.getBotao("BOTAO AMARELO");
        botao.setLargura(38);
        System.out.println(botao);
        Botao botaoPreto = new Botao();
        botaoPreto.setColor("preto");
        botaoPreto.setAltura(10);
        botaoPreto.setLargura(20);
        botaoPreto.setTipoBorda(TipoBorda.SOLID);
        BotaoRegistry.addBotao("BOTAO PRETO",botaoPreto);

        
        Botao botao2 = BotaoRegistry.getBotao("BOTAO PRETO");
        System.out.println(botao2);


    }
}