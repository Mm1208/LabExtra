package com.example.labextrai;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{
    ArrayList<String> event_list = new ArrayList<>();
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        textView = (TextView) findViewById(R.id.event_list);
//        setSupportActionBar(toolbar);
        event_list.add("Se crea la primera actividad.");

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
                Toast.makeText(getApplicationContext(), "Estoy en onCreate de MA", Toast.LENGTH_SHORT).show();
                abrirMAct();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        event_list.add("Se crea la primera actividad.");
        Toast.makeText(getApplicationContext(), "Estoy en onStart de MA2", Toast.LENGTH_SHORT).show();
        // The activity is about to become visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        event_list.add("Se resume la primera actividad.");
        textView.setText(
                event_list.stream().collect(Collectors.joining("\n"))
        );
        Toast.makeText(getApplicationContext(), "Estoy en onResume de MA2", Toast.LENGTH_SHORT).show();
        // The activity has become visible (it is now "resumed").
    }
    @Override
    protected void onPause() {
        super.onPause();
        event_list.add("Se pausa la primera actividad.");
        Toast.makeText(getApplicationContext(), "Estoy en onPause de MA2", Toast.LENGTH_SHORT).show();
        // Another activity is taking focus (this activity is about to be "paused").
    }
    @Override
    protected void onStop() {
        super.onStop();
        event_list.add("Se detiene la primera actividad.");
        Toast.makeText(getApplicationContext(), "Estoy en onStop de MA2", Toast.LENGTH_SHORT).show();
        // The activity is no longer visible (it is now "stopped")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        event_list.add("Se destruye la primera actividad.");
        Toast.makeText(getApplicationContext(), "Estoy en onDestroy de MA2", Toast.LENGTH_SHORT).show();
        // The activity is about to be destroyed.
    }

    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Toast.makeText(getApplicationContext(), "Estoy en onNavigationItemSelected de MA", Toast.LENGTH_SHORT).show();
        //getting logged user
        /*SharedPreferences prefs = this.getSharedPreferences(getString(R.string.preference_user_key), Context.MODE_PRIVATE);
        String defaultValue = getResources().getString(R.string.preference_user_key_default);
        String privilegio = prefs.getString(getString(R.string.preference_user_key), defaultValue);*/

        /*if (id == R.id.nav_MainActivity) {
            Toast.makeText(getApplicationContext(), "Main Activity", Toast.LENGTH_SHORT).show();
            abrirMAct();
        }*/

        /*DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);*/
        return true;
    }

    public void abrirMAct() {
        finish();
        Intent a = new Intent(this, SecondActivity.class);
        startActivity(a);
    }

}