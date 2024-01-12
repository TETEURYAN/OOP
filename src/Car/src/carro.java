public class carro {
    //Atributos
    String name;
    String marca;
    int ano;
    int velocity;

    //Métodos

    void acelerar(int value){
        velocity += value;
    }
    void frear(int value){
        velocity -= value;
    }

    int chaci(int value){
        return (ano%5);
    }

}
