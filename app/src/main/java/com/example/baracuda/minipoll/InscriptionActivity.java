package com.example.baracuda.minipoll;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.baracuda.minipoll.R;

/**
 * Created by Baracuda on 3/05/18.
 */

public class InscriptionActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstaceState){
        super.onCreate(savedInstaceState);
        setContentView(R.layout.inscription_page);
    }

    public void retour(View v){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void valider(View v){
        Intent intent = new Intent(this, GestionCompteActivity.class);
        startActivity(intent);
    }

}
