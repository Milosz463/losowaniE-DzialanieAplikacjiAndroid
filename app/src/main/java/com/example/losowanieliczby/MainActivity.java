package com.example.losowanieliczby;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    int liczba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("CYKL_ZYCIA","URUCHOMIONA METODA ONCREATE");

        textView=findViewById(R.id.TextViewLiczba);

        button=findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                      liczba=(int)(Math.random()*100+1);
                      textView.setText(String.valueOf(liczba));
                    }
                }
        );
    }

    @Override
    protected void onStart() {
        super.onStart();
        //metody cyklu zycia nie powinny zostac wywolywane przez programiste
        Log.i("CYKL_ZYCIA","WYKONANA METODA ONSTART");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("CYKL_ZYCIA","WYKONANA METODA ONRESTART");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CYKL_ZYCIA","WYKONANA METODA ONRESUME");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("CYKL_ZYCIA","WYKONANA METODA ONPAUSE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CYKL_ZYCIA","WYKONANA METODA ONSTOP");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("CYKL_ZYCIA","WYKONANA METODA ONDESTROY");
    }
}