package AB04;

class Bibliothek {
    private Medium[] katalog;

    public static void main(String[] args) {
        Buch b1 = new Buch();
        b1.sample = "book1";
        b1.showSample();

        Game g1 = new Game();
        g1.sample = "game1";
        g1.showSample();
    }
}
abstract class Medium {
    public abstract void showSample();
}

class Buch extends Medium {
    String sample;

    @Override
    public void showSample() {
        System.out.println(sample);
    }
}

class CD extends Medium {
    Sound sample;

    @Override
    public void showSample(){
        Player p = new Player();
        p.playSound(sample);
    }
}
class DVD extends Medium {
    Video sample;

    @Override
    public void showSample(){
        Player p = new Player();
        p.playVideo(sample);
    }
}

class Game extends Medium {
    String sample;

    @Override
    public void showSample(){
        System.out.println(sample);
    }
}

class Sound extends Player {}

class Video {}

class Player {
    public void playVideo(Video v) {
// Video anzeigen ...
    }

    public void playSound(Sound s) {
// Sound spielen ...
    }
}