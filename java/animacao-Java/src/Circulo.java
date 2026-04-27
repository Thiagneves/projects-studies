import java.awt.*;
import java.awt.Color;

public class Circulo extends Forma {
    private int raio;

    public Circulo(Ponto ponto, Color cor, int raio) {
        super(ponto, cor);
        if (raio < 0) throw new RuntimeException("raio não pode ser menor que 0");
        this.raio = raio;
    }

    public void desenhar(Graphics g) {
        g.setColor(super.getCor());
        g.fillOval(this.getPonto().getX(),
            this.getPonto().getY(),
            this.getRaio()*2,
            this.getRaio()*2);
    }

    @Override
    public void mover(int dx, int dy) {
        System.out.println("O circulo foi movido!");
        this.getPonto().mover(dx, dy);
    }

    public int getRaio() {
        return raio;
    }
}
