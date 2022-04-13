package structural.adapter;

public class MP3Player extends MediaPlayer {
    public MP3Player(String fileToPlay) {
        super(fileToPlay);
    }
    @Override
    public void play() {
        System.out.println("Play mp3 " + super.fileToPlay);
    }    
}
