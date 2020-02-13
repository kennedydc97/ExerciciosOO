package exercicio02;
public class Exercicio02 {
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(10, 5);
        Triangulo triangulo2 = new Triangulo(-3, 3);
        Triangulo triangulo3 = new Triangulo(-4, 10);

        triangulo1.calcArea();
        triangulo2.calcArea();
        triangulo3.calcArea();
    }
}
