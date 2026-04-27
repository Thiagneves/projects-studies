import java.awt.*;
import java.util.Scanner;
import java.awt.Color;

public class Retangulo extends Forma {
    private int base;
    private  int altura;
    private int area;
    private String tipo = "Retangulo";

    Scanner scanner = new Scanner(System.in);

    public Retangulo(Ponto ponto, Color cor, int base, int altura){
        super(ponto, cor);
        validarDados(base, altura);
        this.base = base;
        this.altura = altura;

        if (base == altura) this.tipo = "Quadrado";
    }

    public void desenhar(Graphics g) {
        g.setColor(super.getCor());
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
                super.getPonto().setX(scanner.nextInt());

                System.out.println("Digite o valor do eixo Dy: ");
                super.getPonto().setY(scanner.nextInt());
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
        super.getPonto().setX(x);
        super.getPonto().setY(y);
    }

    private void validarDados(int base, int altura) {
        if (base < 0) throw new RuntimeException("base não pode ser menor que 0");
        if (altura < 0) throw new RuntimeException("altura não pode ser menor que 0");
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

    public int getArea() { return area; }

    public void setArea(int area) {
        this.area = area;
    }

}
