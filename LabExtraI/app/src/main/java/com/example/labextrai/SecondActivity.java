package com.example.labextrai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class SecondActivity extends AppCompatActivity {
    ArrayList<String> event_list = new ArrayList<>();
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = findViewById(R.id.toolbar);
        textView = (TextView) findViewById(R.id.event_list);
//        setSupportActionBar(toolbar);
        event_list.add("Se crea la segunda actividad.");
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Estoy en onCreate de MA2", Toast.LENGTH_SHORT).show();
                abrirMAct();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        event_list.add("Se crea la segunda actividad.");
        Toast.makeText(getApplicationContext(), "Estoy en onStart de MA2", Toast.LENGTH_SHORT).show();
        // The activity is about to become visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        event_list.add("Se resume la segunda actividad.");
        textView.setText(
                event_list.stream().collect(Collectors.joining("\n"))
        );
        Toast.makeText(getApplicationContext(), "Estoy en onResume de MA2", Toast.LENGTH_SHORT).show();
        // The activity has become visible (it is now "resumed").
    }
    @Override
    protected void onPause() {
        super.onPause();
        event_list.add("Se pausa la segunda actividad.");
        Toast.makeText(getApplicationContext(), "Estoy en onPause de MA2", Toast.LENGTH_SHORT).show();
        // Another activity is taking focus (this activity is about to be "paused").
    }
    @Override
    protected void onStop() {
        super.onStop();
        event_list.add("Se detiene la segunda actividad.");
        Toast.makeText(getApplicationContext(), "Estoy en onStop de MA2", Toast.LENGTH_SHORT).show();
        // The activity is no longer visible (it is now "stopped")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        event_list.add("Se destruye la segunda actividad.");
        Toast.makeText(getApplicationContext(), "Estoy en onDestroy de MA2", Toast.LENGTH_SHORT).show();
        // The activity is about to be destroyed.
    }

    public void abrirMAct() {
        finish();
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
    }

}