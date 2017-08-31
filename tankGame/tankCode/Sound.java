package tankGame.tankCode;


import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Sound{
    public Sound() {

    }

    public void play() {
        File sound = new File("tankGame/resource/Explosion_small.wav");
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(sound));
            clip.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
