package com.example.comexamplemusicplayer;
import android.media.MediaPlayer;

import java.io.IOException;

public class MusicPlayer {
    private MediaPlayer mediaPlayer;

    public void play(String filePath){
        mediaPlayer = new MediaPlayer();
        try{
            mediaPlayer.setDataSource(filePath);
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public void pause(MediaPlayer player){
        if(mediaPlayer != null && mediaPlayer.isPlaying()){
            mediaPlayer.pause();
        }
    }

    public void stop(MediaPlayer player){
        if(mediaPlayer != null){
            mediaPlayer.stop();
            mediaPlayer.reset();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
