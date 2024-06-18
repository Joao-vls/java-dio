public class Botao {
    protected String color;
    protected int largura;
    protected int altura;
    protected TipoBorda tipoBorda;

    public String getColor() {
        return color;
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    public TipoBorda getTipoBorda() {
        return tipoBorda;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setTipoBorda(TipoBorda tipoBorda) {
        this.tipoBorda = tipoBorda;
    }

    @Override
    public String toString() {
        return "Botao{" +
                "color='" + color + '\'' +
                ", largura=" + largura +
                ", altura=" + altura +
                ", tipoBorda=" + tipoBorda +
                '}';
    }
}
