import java.awt.Color;

public class Quadrado extends Forma{
    private int lado;

    public Quadrado(Ponto ponto, Color cor, int lado) {
        super(ponto, cor);
        if(lado < 0) throw new RuntimeException("lado não pode ser menor que 0");
        this.lado = lado;
    }
    public int getLado() {
        return lado;

    }


}
