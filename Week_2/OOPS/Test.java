interface Playable {
    void play();
}

class Veena implements Playable {
    public void play() {
        System.out.println("Playing Veena");
    }
}

class Saxophone implements Playable {
    public void play() {
        System.out.println("Playing Saxophone");
    }
}

public class Test {
    public static void main(String[] args) {

        Veena veena = new Veena();
        veena.play();

        Saxophone saxophone = new Saxophone();
        saxophone.play();

        Playable p;

        p = veena;
        p.play();

        p = saxophone;
        p.play();
    }
}