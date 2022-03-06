// Java program to play an Audio 

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Audio {

    private File pixel = new File("Audio/mystery.wav");
    private Clip clip;
    private File current;

    private AudioInputStream song;

    /**
     * Constructor to initialise the starting song
     *
     * @throws UnsupportedAudioFileException
     * @throws IOException
     * @throws LineUnavailableException
     */
    public Audio() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        song = AudioSystem.getAudioInputStream(pixel);
        current = pixel;
        clip = AudioSystem.getClip();
        clip.open(song);
        clip.start();
    }

    /**
     * takes an audio file and plays that song.
     *
     * @param audio
     * @throws Exception
     */
    public void playAudio(File audio) throws Exception {
        if(!audio.equals(current)) {
            if (clip.isActive()) {
                stopAudio();
            }
            song = AudioSystem.getAudioInputStream(audio);
            clip = AudioSystem.getClip();
            clip.open(song);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            current = audio;
        }
    }

    /**
     * stops the audio
     */
    public void stopAudio() {

        clip.stop();
        clip.close();
    }
}