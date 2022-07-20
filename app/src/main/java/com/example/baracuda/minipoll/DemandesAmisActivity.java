package com.example.baracuda.minipoll;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.baracuda.minipoll.R;

/**
 * Created by Baracuda on 10/05/18.
 */

public class DemandesAmisActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demande_amis_page);
    }

    public void backDAP(View v){
        Intent intent = new Intent(this, GestionAmisActivity.class);
        startActivity(intent);
    }

    public void acceptFriend(View v){
        Toast.makeText(this,"X est désormais ton ami.",Toast.LENGTH_SHORT).show();
    }

    public void refuseFriend(View v){
        Toast.makeText(this,"Tu n'as pas accepté X en ami.",Toast.LENGTH_SHORT).show();
    }

    public void previousDAP(View v){
        Intent intent = new Intent(this, DemandesAmisActivity.class);
        startActivity(intent);
    }

    public void nextDAP(View v){
        Intent intent = new Intent(this, DemandesAmisActivity.class);
        startActivity(intent);
    }

}
