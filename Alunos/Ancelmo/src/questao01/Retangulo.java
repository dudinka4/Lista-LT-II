package questao01;

public class Retangulo {
    private double altura;
    private double largura;

    
    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public Retangulo() {}

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double area() {
        return altura * largura;
    }

    public double perimetro() {
        return (altura + largura) * 2;
    }
    
}
