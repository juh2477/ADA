package com.app.ada;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.facebook.login.LoginManager;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class PerfilActivity extends AppCompatActivity {

    ImageView minhaFoto;
    TextView meuNome, meuEmail;
    Button btnsair;

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        //iniciar Firebase
        mAuth = FirebaseAuth.getInstance();
        FirebaseUser mUser = mAuth.getCurrentUser();

        minhaFoto = findViewById(R.id.minhaFoto);
        meuNome = findViewById(R.id.meuNome);
        meuEmail = findViewById(R.id.meuEmail);
        btnsair = findViewById(R.id.btnSair);
        btnsair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAuth.signOut();
                LoginManager.getInstance().logOut();
                finish();
            }
        });

        if(mUser != null){
            String nome = mUser.getDisplayName();
            String email = mUser.getEmail();
            String photoUrl = mUser.getPhotoUrl().toString();

            Glide.with(this).load(photoUrl).into(minhaFoto);
            meuNome.setText(nome);
            meuEmail.setText(email);
        }
    }

    public void onCLickVoltar(View v){
        //Destrir tela
        finish();
    }
}
