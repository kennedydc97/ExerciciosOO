package exercicio03;
public class Exercicio03 {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Hodor", "Hodor", 999);

        livro1.setAutor("outraPessoa");
        System.out.println(livro1.getAutor());
    }
}
