package com.feiyu.example;

import android.animation.ValueAnimator;
import android.graphics.drawable.RotateDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.SeekBar;
import android.widget.TextView;

import com.feiyu.view.NoClickSeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txt_position = findViewById(R.id.txt_position);
        final TextView txt_wait = findViewById(R.id.txt_wait);
        final TextView txt_common = findViewById(R.id.txt_common);
        final NoClickSeekBar seekbar = findViewById(R.id.seekbar);

        seekbar.setProgressChangedCallback(new NoClickSeekBar.ValidateSeekBarCallBack() {
            @Override
            public void onProgressChangedCallBack(SeekBar seekBar, int progress, boolean fromUser) {
                txt_position.setText(progress + "");
            }

            @Override
            public void onStartTrackingTouchCallBack(SeekBar seekbar) {

            }

            @Override
            public void onStopTrackingTouchCallBack(SeekBar seekbar) {

            }
        });


        txt_common.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekbar.stopAnima();
            }
        });

        txt_wait.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekbar.startAnima();
            }
        });
    }
}
