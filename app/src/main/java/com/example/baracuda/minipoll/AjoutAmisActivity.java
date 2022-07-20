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

public class AjoutAmisActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ajout_ami_page);
    }

    public void backAAP(View v){
        Intent intent = new Intent(this, GestionAmisActivity.class);
        startActivity(intent);
    }

    public void ajoutAmi(View v){
        Toast.makeText(this,"X va confirmer que vous êtes amis.",Toast.LENGTH_SHORT).show();
    }

    public void previousAAP(View v){
        Intent intent = new Intent(this, AjoutAmisActivity.class);
        startActivity(intent);
    }

    public void nextAAP(View v){
        Intent intent = new Intent(this, AjoutAmisActivity.class);
        startActivity(intent);
    }

}
