package structural.adapter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MediaPlayer player = null;
        
        Scanner reader = new Scanner(System.in);
        System.out.print("Choose a media format - 0 for AVI, 1 for OGG, 2 for MP3: ");
        int n = reader.nextInt();               
        reader.close();
        
        switch(n) {
            case 0:
                player = new AVIPlayer("fileName.avi");
                break;
            case 1:
                player = new OGGPlayer("fileName.ogg");
                break;
            case 2:
                player = new MP3Player("fileName.mp3");
                break;
                            
            default:
                System.err.println("Wrong option:" + n);
                System.exit(-1);
                break;            
        }
        
        if (player != null)
            player.play();  
    }
}
