package com.example.notasenfermeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlanManejo extends AppCompatActivity {

    Button Valoración,Rehabilitación,ClinicaHeridas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_manejo);

        Valoración= (Button) findViewById(R.id.Valoración);
        Rehabilitación= (Button) findViewById(R.id.Rehabilitación);
        ClinicaHeridas= (Button) findViewById(R.id.ClinicaHeridas);

        Valoración.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PlanManejo.this, valoraciones.class));
            }
        });
        Rehabilitación.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PlanManejo.this, Rehabilitacion.class));
    }
});
        ClinicaHeridas.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v){
            startActivity(new Intent(PlanManejo.this, ClinicaHeridas.class));
        }
        });
        }
    }