package com.example.baracuda.minipoll;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.baracuda.minipoll.R;

/**
 * Created by Baracuda on 3/05/18.
 */

public class GestionCompteActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.compte_page);
    }

    public void modifCompte(View v) {
        Toast.makeText(this, "Les informations ont bien été enregistrées.", Toast.LENGTH_SHORT).show();
    }

    public void retourCompte(View v){
            Intent intent = new Intent(this, MainMenuActivity.class);
            startActivity(intent);
    }

    public void image(View v){
        Toast.makeText(this, "Ton image a bien été modifiée.", Toast.LENGTH_SHORT).show();
    }

}
