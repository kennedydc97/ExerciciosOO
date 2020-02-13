package exercicio03;
public class Livro {
    private String titulo;
    private String autor;
    private int nmrDePaginas;

    public Livro() {
    }

    public Livro(String titulo, String autor, int nmrDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.nmrDePaginas = nmrDePaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        System.out.println("operação inválida");
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        System.out.println("operação inválida");
    }

    public int getNmrDePaginas() {
        return nmrDePaginas;
    }

    public void setNmrDePaginas(int nmrDePaginas) {
        System.out.println("operação inválida");
    }
}
