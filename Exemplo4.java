package Lista3;

interface Pessoa {
    void MecherCelular();
}
class Homem implements Pessoa {
    public void MecherCelular() {
        System.out.println("O Homem esta mechendo no celular");
    }
}

class Mulher implements Pessoa {
    public void MecherCelular() {
        System.out.println("A Mulher esta mechendo no celular");
    }
}

public class Exemplo4 {
    public static void main(String[] args) {
        Pessoa Pessoa1 = new Homem();
        Pessoa Pessoa2 = new Mulher();

        Pessoa1.MecherCelular();
        Pessoa2.MecherCelular();
    }
}
