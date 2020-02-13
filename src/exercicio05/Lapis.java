package exercicio05;

public class Lapis implements Escrever {
    private String ehFeitoDe;
    private String escreveCom;

    public Lapis() {
        this.ehFeitoDe = "madeira";
        this.escreveCom = "grafite";
    }

    @Override
    public void escrever() {
        System.out.println("Escrevendo com: " + escreveCom + "\nMaterial utilizado: " + ehFeitoDe);
    }
}
