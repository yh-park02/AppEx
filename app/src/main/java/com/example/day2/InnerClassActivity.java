package com.example.day2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InnerClassActivity extends AppCompatActivity {

    //사용할 뷰에 대한 인스턴스 변수를 생성
    private TextView innerdisplay;
    private Button innerbtn;

    //내부 클래스를 만들면 외부 클래스의 인스턴스 변수를 사용 가능
    class InnerEventHandler implements View.OnClickListener{
        public void onClick(View v){
            innerdisplay.setText("이너 클래스를 이용한 이벤트 처리");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inner_class);

        //뷰들을 찾아오고 버튼의 클릭 이벤트 핸들러를 설정
        innerdisplay = (TextView)findViewById(R.id.innerdisplay);
        innerbtn = (Button)findViewById(R.id.innerbtn);

        InnerEventHandler eventHandler = new InnerEventHandler();
        innerbtn.setOnClickListener(eventHandler);
    }
}
