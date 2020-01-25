package com.example.day2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AnonymousActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anonymous);

        final TextView display = (TextView)findViewById(R.id.anonydisplay);
        Button btn = (Button)findViewById(R.id.anonybtn);


        View.OnClickListener eventHandler = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText("익명 클래스를 이용한 이벤트 처리");
            }
        };
        btn.setOnClickListener(eventHandler);
    }
}
