package Lista3;

abstract class pessoa {
    protected String nome;

    public pessoa(String nome) {
        this.nome = nome;
    }

    public abstract void MecheCelular();

    public void dormir() {
        System.out.println("Pessoa esta dormindo");
    }
}

class Homem extends pessoa {
    public Homem(String nome) {
        super(nome);
    }

    public void MecheCelular() {
        System.out.println("O homem meche no celular");
    }
}

class Mulher extends pessoa {
    public Mulher(String nome) {
        super(nome);
    }

    public void MecheCelular() {
        System.out.println("A mulher meche no celular");
    }
}

public class Exemplo2 {
    public static void main(String[] args) {
        Homem homem = new Homem("Paulo");
        Mulher mulher = new Mulher("Ana");

        homem.MecheCelular();
        homem.dormir();

        mulher.MecheCelular();
        mulher.dormir();
    }
}