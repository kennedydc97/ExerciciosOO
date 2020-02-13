package exercicio05;

public class Caneta implements Escrever {
    private String ehFeitoDe;
    private String escreveCom;

    public Caneta() {
        this.ehFeitoDe = "plastico";
        this.escreveCom = "tinta";
    }

    @Override
    public void escrever() {
        System.out.println("Escrevendo com: " + escreveCom + "\nMaterial utilizado: " + ehFeitoDe);
    }
}
