package structural.adapter;

public abstract class MediaPlayer {
    protected String fileToPlay;
    
    MediaPlayer(String ftp) {
        fileToPlay = ftp;        
    }
    public abstract void play();
}
