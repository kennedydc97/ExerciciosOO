package exercicio02;
public class Triangulo {
    private double base;
    private double altura;

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcArea() {
        if (this.base > 0 && this.altura > 0) {
            double area = base * altura;
            System.out.println("o valor da area é: " + area);
        } else {
            System.out.println("atributos do triangulo invalido.");
        }
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
