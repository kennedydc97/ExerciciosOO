package exercicio04;
public class Pessoa {
    private String nome;
    private int idade;
    private String cidNasc;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String cidNasc) {
        this.nome = nome;
        this.idade = idade;
        this.cidNasc = cidNasc;
    }

    public void exibirDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.cidNasc);
    }


}
