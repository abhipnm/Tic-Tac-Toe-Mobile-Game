package com.example.lenovo.tictactoeupdated;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by Lenovo on 06-12-2016.
 */
public class musicopt extends AppCompatActivity {

    Button b1,b2,b3;
    Boolean b;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.musicopt);

        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);

        final MediaPlayer mp =MediaPlayer.create(musicopt.this,R.raw.a);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if(mp.isPlaying()){
                        mp.pause();
                        b2.setText("ON");
                        b2.setBackgroundResource(R.drawable.on1);
                        b1.setText("MUSIC IS OFF");
                    }
                    else {
                        mp.start();
                        b2.setText("OFF");
                        b2.setBackgroundResource(R.drawable.off);
                        b1.setText("MUSIC IS ON");
                    }
                }

        });
    }

}
