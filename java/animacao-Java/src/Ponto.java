import java.io.PipedOutputStream;
import java.security.PublicKey;

public class Ponto {
    private int x;
    private int y;

    public void mover(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
