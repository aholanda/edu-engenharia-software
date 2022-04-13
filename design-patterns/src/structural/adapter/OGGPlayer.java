package structural.adapter;

public class OGGPlayer extends MediaPlayer {
    public OGGPlayer(String fileToPlay) {
        super(fileToPlay);
    }
    
    @Override
    public void play() {
        System.out.println("Play ogg " + super.fileToPlay);    
    }    
}
