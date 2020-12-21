package com.example.conectado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostraAcao(View view){
        TextView texto=findViewById(R.id.sorteio);
        texto.setText("Numero Sorteado Foi : "+ Sorteio());

    }
    public int Sorteio(){
        Random sorteio=new Random();
        for(int i=0 ; i<1; i++){
            return sorteio.nextInt(10);

        }
        return Sorteio();

    }
}