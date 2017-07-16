package com.example.lg.nado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button but_p,but_s,but_f,but_w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but_w=(Button)findViewById(R.id.but_w);
        but_p=(Button)findViewById(R.id.but_p);
        but_f=(Button)findViewById(R.id.but_f);
        but_s=(Button)findViewById(R.id.but_c);
        but_w.setOnClickListener(butHandler);
        but_p.setOnClickListener(butHandler);
        but_f.setOnClickListener(butHandler);
        but_s.setOnClickListener(butHandler);
    }
    View.OnClickListener butHandler=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.but_w:break;
                case R.id.but_c:break;
                case R.id.but_f:break;
                case R.id.but_p:break;
            }
            }
    };
}
