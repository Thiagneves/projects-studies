import java.awt.*;

public class Quadrado {
    private Ponto ponto;
    private int lado;
    private Color cor;

    public Quadrado(Ponto ponto, int lado, Color cor) {
        if(lado < 0) throw new RuntimeException("lado não pode ser menor que 0");

        this.ponto = ponto;
        this.lado = lado;
        this.cor = cor;
    }

    public void desenhar(Graphics g) {
        g.setColor(this.cor);
        g.fillRect(this.getPonto().getX(),
                this.getPonto().getY(),
                this.getLado(),
                this.getLado());
    }

    public Ponto getPonto() {
        return ponto;
    }

    public int getLado() {
        return lado;
    }

    public Color getCor() {
        return cor;
    }
}
