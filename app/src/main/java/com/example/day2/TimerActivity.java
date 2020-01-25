package com.example.day2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.TextView;

public class TimerActivity extends AppCompatActivity {

    private TextView numdisplay;
    private Button start;
    private Button end;

    //인덱스 변수
    private int idx;
    //타이머 변수
    private CountDownTimer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        numdisplay = (TextView)findViewById(R.id.numdisplay);
        start = (Button)findViewById(R.id.start);
        end = (Button)findViewById(R.id.end);

        start.setOnClickListener((view)->{
            timer = new CountDownTimer(10000, 1000) {
                @Override
                public void onTick(long l) {
                    idx = idx + 1;
                    numdisplay.setText(idx + "");
                }
                @Override
                public void onFinish() {}
            };
            timer.start();
        });

        end.setOnClickListener((view)->{
            if(timer != null){
                timer.cancel();
                timer = null;
            }
        });

    }
}
