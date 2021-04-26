package AB04;

class Main{
    public static void main(String[] args) {
        Buch b1 = new Buch();
        b1.sample = "hallo";
        b1.zeigen();
    }
}

class Bibliothek {
    private Medium[] katalog;
    public void showSample(Medium m) {
        m.zeigen();
    }
}
abstract class Medium {
    public abstract void zeigen();
}

class Buch extends Medium {
    String sample;
    public void zeigen(){
        System.out.println(sample);
    }
}

class CD extends Medium {
    Sound sample;
    public void zeigen(){
        Player p = new Player();
        p.playSound(sample);
    }
}
class DVD extends Medium {
    Video sample;
    public void zeigen(){
        Player p = new Player();
        p.playVideo(sample);
    }
}

class Sound {}

class Video {}

class Player {
    public void playVideo(Video v) {
// Video anzeigen ...
    }

    public void playSound(Sound s) {
// Sound spielen ...
    }
}