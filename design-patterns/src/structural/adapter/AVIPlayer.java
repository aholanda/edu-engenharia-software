package structural.adapter;

public class AVIPlayer extends MediaPlayer {
    AVIReader aviReader;
    
    public AVIPlayer(String fileToPlay) {
        super(fileToPlay);
        this.aviReader = new AVIReader();
    }
    
    @Override
    public void play() {
        this.aviReader.playFile(super.fileToPlay);
    }    
}
