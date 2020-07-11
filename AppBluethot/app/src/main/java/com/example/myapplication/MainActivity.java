package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next = (Button) findViewById(R.id.btnnextactivity);


    }

    public void buscar(View view) {
        Intent siguiente = new Intent(this, Dispositivos.class);
        startActivity(siguiente);
    }

    public void info(View view) {
        Intent siguiente = new Intent(this, info_app.class);
        startActivity(siguiente);
    }
}
