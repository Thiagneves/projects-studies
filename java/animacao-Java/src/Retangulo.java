import java.awt.*;
import java.util.Scanner;

public class Retangulo {
    private Ponto ponto;
    private int base;
    private  int altura;
    private Color cor;
    private int area;
    private String tipo = "Retangulo";

    Scanner scanner = new Scanner(System.in);

    public Retangulo(Ponto ponto, int base, int altura, Color cor){
        validarDados(base, altura);

        this.ponto = ponto;
        this.base = base;
        this.altura = altura;
        this.cor = cor;

        if (base == altura) this.tipo = "Quadrado";
    }

    public void desenhar(Graphics g) {
        g.setColor(this.cor);
        g.fillRect(this.getPonto().getX(),
                this.getPonto().getY(),
                this.getBase(),
                this.getAltura());
    }

    public float CalcularArea() {
        area = base * altura;
        return area;
    }

    public void Redimencionar() {
        System.out.println("Escreva o valor da nova Base: ");
        int novaBase = scanner.nextInt();

        System.out.println("Escreva o valor da nova Altura: ");
        int novaAltura = scanner.nextInt();

        validarDados(novaBase, novaAltura);

        int escolha;

        do {
            System.out.println("Deseja alterar os Pontos?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");

            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.println("Digite o valor do eixo Dx: ");
                ponto.setX(scanner.nextInt());

                System.out.println("Digite o valor do eixo Dy: ");
                ponto.setY(scanner.nextInt());
            }
        } while (escolha != 1 && escolha != 2);

        setBase(novaBase);
        setAltura(novaAltura);
    }

    public void Descricao() {
        System.out.println("========= Descrição ========");
        System.out.println("Tipo: " +tipo);
        System.out.println("Base: " +base);
        System.out.println("Altura: " +altura);
        System.out.println("Area: " +area);
        System.out.println("========= ========= =========");
    }

    public void Mover(int x, int y) {
        ponto.setX(x);
        ponto.setY(y);
    }

    private void validarDados(int base, int altura) {
        if (base < 0) throw new RuntimeException("base não pode ser menor que 0");
        if (altura < 0) throw new RuntimeException("altura não pode ser menor que 0");
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public int getArea() { return area; }

    public void setArea(int area) {
        this.area = area;
    }

}
