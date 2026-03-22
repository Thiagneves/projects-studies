import java.awt.*;

public class Circulo {
    private Ponto ponto;
    private int raio;
    private Color cor;

    public Circulo(Ponto ponto, int raio, Color cor) {
        if (raio < 0) throw new RuntimeException("raio não pode ser menor que 0");

        this.ponto = ponto;
        this.raio = raio;
        this.cor = cor;
    }

    public Circulo(int x, int y, int raio, Color cor) {
        //
        this(new Ponto(x, y), raio, cor);
    }

    public void mover(int dx, int dy) {
        this.ponto.mover(dx, dy);
    }

    public void desenhar(Graphics g) {
        g.setColor(this.cor);
        g.fillOval(this.getPonto().getX(),
            this.getPonto().getY(),
            this.getRaio()*2,
            this.getRaio()*2);
    }

    public Ponto getPonto() {
        return ponto;
    }

    public int getRaio() {
        return raio;
    }

    public Color getCor() {
        return cor;
    }
}
