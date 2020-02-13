package exercicio05;

public class PenaMosquito implements Escrever {
    private String ehFeitoDe;
    private String escreveCom;

    public PenaMosquito() {
        this.ehFeitoDe = "metal";
        this.escreveCom = "nanquim";
    }

    @Override
    public void escrever() {
        System.out.println("Escrevendo com: " + escreveCom + "\nMaterial utilizado: " + ehFeitoDe);
    }
}
