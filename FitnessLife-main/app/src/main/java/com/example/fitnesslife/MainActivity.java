package com.example.fitnesslife;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.Tela_cadastro1), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



       // Intent in = new Intent(MainActivity.this, nubank_tela.class);
       // startActivity(in); mudar tela
    }
    public void MudarCadastro (View v) {
        Intent in = new Intent(MainActivity.this, Tela_cadastro1.class);
        startActivity(in);
    }

    public void  mudarLogin(View v){
        Intent in =  new Intent(MainActivity.this, Tela_menu.class);
        startActivity(in);
    }
}