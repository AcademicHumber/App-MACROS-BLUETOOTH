package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.hp.bluetoothjhr.BluetoothJhr;

import java.io.Console;

public class  conexion_bluetooth extends AppCompatActivity {
    BluetoothJhr bluetoothJhr2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conexion_bluetooth);

        bluetoothJhr2= new BluetoothJhr(MainActivity.class,this);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    delay();
                    if (bluetoothJhr2.Rx() != null && bluetoothJhr2.Rx() != "null" && !bluetoothJhr2.Rx().equalsIgnoreCase("null") && bluetoothJhr2.Rx() != "") {
                        String dato = bluetoothJhr2.Rx();
                    }
                    }
                }
            }
        );

    }
    @Override
    public void onResume(){
        super.onResume();
        bluetoothJhr2.ConectaBluetooth();
    }

    @Override
    public  void onPause(){
        super.onPause();
        bluetoothJhr2.CierraConexion();
    }

    private void delay(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void accion1(View view) {
        bluetoothJhr2.Tx("1");
    }
    public void accion2(View view) {
        bluetoothJhr2.Tx("2");
    }
    public void accion3(View view) {
        bluetoothJhr2.Tx("3");
    }
    public void accion4(View view) {
        bluetoothJhr2.Tx("4");
    }
    public void accion5(View view) {
        bluetoothJhr2.Tx("5");
    }
    public void accion6(View view) {
        bluetoothJhr2.Tx("6");
    }
    public void accion7(View view) {
        bluetoothJhr2.Tx("7");
    }
    public void accion8(View view) {
        bluetoothJhr2.Tx("8");
    }
}
