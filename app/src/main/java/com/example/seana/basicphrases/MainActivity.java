package com.example.seana.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        // so first we will get what we are clicking (which will be a button)
        Button button = (Button) view;
        Log.i("Button Pressed",button.getTag().toString());

        // now we get the file that we wish to place in the circumstance
        // now this is going to be based on a tag which we will want to put inside of a variable
        // and depending on the tag picked we play its corresponding audio file
        MediaPlayer mPlayer = MediaPlayer.create(this, getResources().getIdentifier(button.getTag().toString(), "raw", getPackageName()));
        mPlayer.start();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
