package com.example.comexamplemusicplayer;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;

import java.io.IOException;

public class MusicPlayer {
    private MediaPlayer mediaPlayer;
    public static final String path_File = "C:\\Users\\prave\\AndroidStudioProjects\\comexamplemusicplayer\\app\\src\\main\\res\\raw\\sim.mp3";

    public void prepare() throws IOException {
        mediaPlayer.prepare();
    }

    public void play() {
        if(mediaPlayer==null){
            try {
                int uri = R.raw.simple;
                mediaPlayer = new MediaPlayer();
                mediaPlayer.setDataSource(path_File);
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        mediaPlayer.start();
    }
    public void pause(){
        if(mediaPlayer != null){
            mediaPlayer.pause();
        }
    }

    public void stop(){
        stopPlayer();
    }

    private void stopPlayer(){
        if(mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
