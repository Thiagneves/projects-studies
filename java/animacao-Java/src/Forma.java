import java.awt.Color;

public class Forma {
    private Ponto ponto;
    private Color cor;

    public Forma(Ponto ponto, Color color) {
        this.ponto = ponto;
        this.cor = color;
    }

    public void mover(int dx, int dy) {
        this.ponto.mover(dx, dy);
    }

    public Ponto getPonto(){
        return ponto;
    }
    public Color getCor() {
        return cor;
    }
}
