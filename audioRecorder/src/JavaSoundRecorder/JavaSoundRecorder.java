/*
 *  Created by IntelliJ IDEA.
 *  User: ABHISHEK
 *  Date: 16-04-2020
 *  Time: 21:17
 */
package JavaSoundRecorder;

import javax.sound.sampled.*;
import java.io.*;

public class JavaSoundRecorder {

    //record duration in milliseconds
    static final long RECORD_TIME = 6000;// 1 min

    // path of the WAV file
    File wavFile = new File("RecordedAudio.wav");

    // format of the audio file

    AudioFileFormat.Type FileType = AudioFileFormat.Type.WAVE;

    // the line from which audio data is captured
    TargetDataLine line;

    /**
     * Defines an audio format
     */

    AudioFormat getAudioFormat(){
        float sampleRate = 8000.0f;
        int sampleSizeInBits = 16;
        int channels =1;
        boolean signed = true;
        boolean bigEndian = true;
        AudioFormat format = new AudioFormat(sampleRate,sampleSizeInBits,channels, true, true);
        return format;
    }

    /**
     * captures the sound and records into wav file
     */

    void start() throws LineUnavailableException {
        try{
            AudioFormat format = getAudioFormat();
            DataLine.Info info = new DataLine.Info(TargetDataLine.class,format);

            //checks if system supports the data line

            if(!AudioSystem.isLineSupported(info)){
                System.out.println(" line not supported");
                System.exit(0);
            }

            line = (TargetDataLine) AudioSystem.getLine(info);
            line.open(format);
            line.start();// starts capturing

            System.out.println("capturing started......");

            AudioInputStream ais = new AudioInputStream(line);

            System.out.println("Start recording ");
            //start recording
            AudioSystem.write(ais,FileType,wavFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * closes the target data line to finish capturing the recording
     */

    void finish(){
        line.stop();
        line.close();
        System.out.println("finished");
    }
    public static void main(String[] args) throws LineUnavailableException {

        final JavaSoundRecorder recorder = new JavaSoundRecorder();

        //creates a new thread that waits for specified time before stopping

        Thread stopper = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(6000);
                }
                catch (InterruptedException ex ){
                    ex.printStackTrace();
                }
                recorder.finish();

            }
        });

        stopper.start();

        //start recording
        recorder.start();
    }
}
