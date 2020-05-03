package com.app.ada;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickLogin(View v){
        //Criar tela
        Intent iLogin = new Intent(this, LoginActivity.class);
        //Abrir tela
        startActivity(iLogin);
    }
    public void onClickCadastrar(View v){
        //Criar tela
        Intent iCadastro = new Intent(this, CadastroActivity.class);
        //Abrir tela
        startActivity(iCadastro);
    }
}
