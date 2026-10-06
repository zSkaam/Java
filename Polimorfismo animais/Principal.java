public class Principal {
    public static void main(String[] args){
        Animal[] animais = {new Cachorro(), new Gato()};
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
