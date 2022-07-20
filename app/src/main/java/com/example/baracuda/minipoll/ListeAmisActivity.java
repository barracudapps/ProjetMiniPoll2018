package com.example.baracuda.minipoll;


import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.baracuda.minipoll.R;
import com.example.baracuda.minipoll.ex.NonexistentException;
import com.example.baracuda.minipoll.ex.NotConnectedException;

import java.util.Collections;
import java.util.List;

/**
 * Created by Baracuda on 7/05/18.
 */

public class ListeAmisActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gestion_liste_amis_page);
    }

    public void backGLAP(View v){
        Intent intent = new Intent(this, GestionAmisActivity.class);
        startActivity(intent);
    }

    public void best_friend(View v){
        Toast.makeText(this,"X est ton meilleur ami !",Toast.LENGTH_SHORT).show();
    }

    public void delete_friend(View v) throws NotConnectedException {
        Toast.makeText(this,"Cette personne n'est plus ton amie.",Toast.LENGTH_SHORT).show();
    }

    public void previousGLAP(View v){
        Intent intent = new Intent(this, ListeAmisActivity.class);
        startActivity(intent);
    }

    public void nextGLAP(View v){
        Intent intent = new Intent(this, ListeAmisActivity.class);
        startActivity(intent);
    }

}
