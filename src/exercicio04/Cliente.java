package exercicio04;
public class Cliente extends Pessoa {
    private String CPF;

    public Cliente() {
    }

    public Cliente(String nome, int idade, String cidNasc, String CPF) {
        super(nome, idade, cidNasc);
        this.CPF = CPF;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println(this.CPF);
    }
}
