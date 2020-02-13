package exercicio04;

public class Exercicio04 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("hodor", 25, "winterfall");
        Cliente cliente1 = new Cliente("jon", 30, "winterfall", "12832813");
        Funcionario funcionario1 = new Funcionario("noOne", 10239, "unknown", 192839);

        System.out.println("------TESTE PESSOA------");
        pessoa1.exibirDados();
        System.out.println("------TESTE CLIENTE------");
        cliente1.exibirDados();
        System.out.println("------TESTE FUNCIONARIO------");
        funcionario1.exibirDados();

    }
}
