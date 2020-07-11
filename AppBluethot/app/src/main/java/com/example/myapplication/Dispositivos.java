package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hp.bluetoothjhr.BluetoothJhr;

public class Dispositivos extends AppCompatActivity {
    ListView idlista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_disp);

        idlista=(ListView)findViewById(R.id.idlista);

        final BluetoothJhr bluetoothJhr=new BluetoothJhr(this,idlista);
        bluetoothJhr.EncenderBluetooth();

        idlista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                bluetoothJhr.Disp_Seleccionado(view,position,conexion_bluetooth.class);
            }
        });


    }
}
