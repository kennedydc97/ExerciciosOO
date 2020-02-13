package exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Leão", 5, 78.53);
        Animal animal2 = new Animal("Girafa", 5, 78.53);
        Animal animal3 = new Animal("Rinoceronte", 5, 78.53);

        animal1.comer();

        animal2.correr();

        animal3.dormir();

    }
}
