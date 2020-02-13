package exercicio01;

public class Animal {
    private String nome;
    private int idade;
    private double peso;

    public Animal() {
    }

    public Animal(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void correr(){
        System.out.println("estou correndo como um " + this.nome);
    }

    public void comer(){
        System.out.println("estou comendo como um " + this.nome);
    }

    public void dormir(){
        System.out.println("estou dormindo como um " + this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
