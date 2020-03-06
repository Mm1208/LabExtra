package com.example.labextrai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Estoy en onCreate de MA2", Toast.LENGTH_SHORT).show();
                abrirMAct();
            }
        });
    }

    /*@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // The activity is being created.
    }*/
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "Estoy en onStart de MA2", Toast.LENGTH_SHORT).show();
        // The activity is about to become visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "Estoy en onResume de MA2", Toast.LENGTH_SHORT).show();
        // The activity has become visible (it is now "resumed").
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "Estoy en onPause de MA2", Toast.LENGTH_SHORT).show();
        // Another activity is taking focus (this activity is about to be "paused").
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "Estoy en onStop de MA2", Toast.LENGTH_SHORT).show();
        // The activity is no longer visible (it is now "stopped")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "Estoy en onDestroy de MA2", Toast.LENGTH_SHORT).show();
        // The activity is about to be destroyed.
    }

    public void abrirMAct() {
        finish();
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
    }

}