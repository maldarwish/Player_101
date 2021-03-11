package com.example.lab6_demo;

import android.media.MediaPlayer;

public class MusicPlayer  {

    MediaPlayer player;
    int currentPosition = 0;
    int musicIndex = 0;
    private int musicStatus = 0;//0: before playing, 1 playing, 2 paused
    private MusicService musicService;

    static final int[] MUSICPATH = new int[]{
            R.raw.mario,
            R.raw.tetris
    };

    static final String[] MUSICNAME = new String[]{
            "Super Mario Brothers",
            "Tetris"
    };

    public MusicPlayer(MusicService service) {

        this.musicService = service;
    }


    public int getMusicStatus() {

        return musicStatus;
    }

    public String getMusicName() {

        return MUSICNAME[musicIndex];
    }

    public void playMusic() {

    }

    public void pauseMusic() {

    }

    public void resumeMusic() {

    }

}