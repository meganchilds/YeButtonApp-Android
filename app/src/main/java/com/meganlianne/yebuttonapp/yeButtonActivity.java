package com.meganlianne.yebuttonapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class yeButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ye_button);

        final MediaPlayer yeButtonMP= MediaPlayer.create(this, R.raw.ye_btn);

        Button yeBtn = (Button) this.findViewById(R.id.yeBtn);


        yeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yeButtonMP.start();
            }

        });
    }
}
