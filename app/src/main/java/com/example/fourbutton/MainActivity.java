package com.example.fourbutton;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fourbutton.R;

public class MainActivity extends AppCompatActivity {

    Button btn_web, btn_call, btn_photo, btn_exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // xml 파일에서 만튼 버튼 객체와 연결해준다.
        btn_web = findViewById(R.id.btn_web);
        btn_call = findViewById(R.id.btn_call);
        btn_photo = findViewById(R.id.btn_photo);
        btn_exit = findViewById(R.id.btn_exit);

        // 버튼에 색상을 지정해준다.
        btn_web.setBackgroundColor(Color.GRAY);
        btn_call.setBackgroundColor(Color.GREEN);
        btn_photo.setBackgroundColor(Color.RED);
        btn_exit.setBackgroundColor(Color.YELLOW);

        // 클릭시 네이트 홈페이지가 열린다
        btn_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.nate.com"));
                startActivity(mIntent);
            }
        });

        // 911 입력된 상태로 전화 어플이 열린다.
        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/911"));
                startActivity(mIntent);
            }
        });

        // 갤러리가 열린다.
        btn_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
                startActivity(mIntent);
            }
        });

        // 앱을 종료한다.
        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}