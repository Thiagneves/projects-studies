import javax.swing.*;
import java.awt.*;

public class Desenho extends JFrame {

    Circulo circulo;

    public Desenho(){
        this.setTitle("Meu desenho");
        this.setSize(300, 300);
        this.setVisible(true);
        circulo = new Circulo(new Ponto(50, 50), 50, Color.RED);

        new Thread(() -> {
            while (true) {
                mover();
                repaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void mover() {
        this.circulo.mover(10, 0);
        if (this.circulo.getPonto().getX() > this.getWidth()){
            this.circulo.mover(-this.getWidth(), 0);
        }
    }

    public void paint(Graphics g){
        super.paint(g);
        circulo.desenhar(g);

    }



    //g.drawLine(0, 0, 300, 300); -> Linha
}

/*
        Circulo c2 = new Circulo(new Ponto(50, 160), 50, Color.BLUE);
        c2.desenhar(g);

        Quadrado q = new Quadrado(new Ponto(160, 50), 50, Color.GREEN);
        q.desenhar(g);

        Retangulo r = new Retangulo(new Ponto(100, 100), 50, 100, Color.BLACK);
        r.desenhar(g);

 */
