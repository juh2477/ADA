package com.app.ada;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void onClickPerfil(View v){
        //Criar tela
        Intent iPerfil = new Intent(this, PerfilActivity.class);
        //Abrir tela
        startActivity(iPerfil);
    }
}
