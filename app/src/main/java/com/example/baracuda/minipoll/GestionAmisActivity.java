package com.example.baracuda.minipoll;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.baracuda.minipoll.R;

/**
 * Created by Baracuda on 7/05/18.
 */

public class GestionAmisActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gestion_amis_page);
    }

    public void backGAP(View v){
        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);
    }

    public void listeAmisGAP(View v){
        Intent intent = new Intent(this, ListeAmisActivity.class);
        startActivity(intent);
    }

    public void ajoutAmisGAP(View v){
        Intent intent = new Intent(this, AjoutAmisActivity.class);
        startActivity(intent);
    }

    public void demandesAmisGAP(View v){
        Intent intent = new Intent(this, DemandesAmisActivity.class);
        startActivity(intent);
    }

}
