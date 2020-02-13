package exercicio04;
public class Funcionario extends Pessoa {
    private int nmrMatricula;

    public Funcionario() {
    }

    public Funcionario(String nome, int idade, String cidNasc, int nmrMatricula) {
        super(nome, idade, cidNasc);
        this.nmrMatricula = nmrMatricula;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println(this.nmrMatricula);
    }
}
