package com.talo.seekbardemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtseekBarValue, txtrationBarValue;
    private SeekBar seekBar;
    private RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtseekBarValue = findViewById(R.id.seekBarValue);
        txtrationBarValue = findViewById(R.id.rationBarValue);

        seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
           @Override
           public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
               String string = getString(R.string.seekbarMsg);
               txtseekBarValue.setText(string + String.valueOf(progress));
                //改變位置時執行
           }

           @Override
           public void onStartTrackingTouch(SeekBar seekBar) {
                //準備開始拖曳時執行
           }

           @Override
           public void onStopTrackingTouch(SeekBar seekBar) {
                //放開SeekBar時執行
           }
       });

        ratingBar = findViewById(R.id.rationBar);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                String string = getString(R.string.rationbarMsg);
                txtrationBarValue.setText(string + String.valueOf(rating));
                //評分改變時執行
            }
        });
    }
}