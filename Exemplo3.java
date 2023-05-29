package Lista3;

interface Pessoa {
    void MecherCelular();

    void Dormir();
}

class Homem implements Pessoa {
    public void MecherCelular() {
        System.out.println("O Homem esta mechendo no celular");
    }

    public void Dormir() {
        System.out.println("O Homem esta dormindo");
    }
}

class Mulher implements Pessoa {
    public void MecherCelular() {
        System.out.println("A Mulher esta mechendo no celular");
    }

    public void Dormir() {
        System.out.println("A Mulher esta dormindo");
    }
}

public class Exemplo3 {
    public static void main(String[] args) {
        Pessoa Homem = new Homem();
        Homem.MecherCelular();
        Homem.Dormir();

        Pessoa Mulher = new Mulher();
        Mulher.MecherCelular();
        Mulher.Dormir();
    }
}
