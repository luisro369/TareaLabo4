package com.luisro00005513.tarealabo4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements NexusInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //--------------------------------------------
    }//on create

    @Override
    public void menuLinear(int QueLinear) {
        Intent planeta = new Intent(this, Main2Activity.class);
        planeta.putExtra("planetaSeleccionado",QueLinear);
        startActivity(planeta);

    }
    

}//onCreate
