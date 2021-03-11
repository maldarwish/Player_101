package com.example.lab6_demo;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class MusicService extends Service {

    MusicPlayer musicPlayer;

    public static final String COMPLETE_INTENT = "complete intent";
    public static final String MUSICNAME = "music name";

    @Override
    public void onCreate() {
        super.onCreate();
        musicPlayer = new MusicPlayer(this);
    }

    public void startMusic(){


    }

    public void pauseMusic(){


    }

    public void resumeMusic(){


    }

    public int getPlayingStatus(){
        return 0;
    }


    public void onUpdateMusicName(String musicname) {

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {

        return null;
    }


    public class MyBinder extends Binder {


    }
}
