package br.com.itb.aula01trocajanelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Criar objeto java correspondente ao botão da tela
        //findViewById() criará um vínculo entre eles
        Button botao = findViewById(R.id.btnTrocarJanela);

        // Adicionar método de acionamento do botão por clique
        botao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // Chamada da janela acitivity_main2.xhtml
                Intent it = new Intent(getBaseContext(), MainActivity2.class);
                // Início do ciclo de da atividade MainActivity2
                Toast.makeText(getBaseContext(), "Trocando de tela...", Toast.LENGTH_LONG).show();
                startActivity(it);
            }
        });
    }
}