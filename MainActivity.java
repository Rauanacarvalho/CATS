package com.example.cats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_entrar = (Button) findViewById(R.id.btn_entrar);
        btn_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.i("Cats", "O usuário entrou na tela de anotações do app");
                Intent tela2 =
                        new Intent(MainActivity.this, PlannerActivity.class);
                startActivity(tela2);
            }
        });
    }
}
