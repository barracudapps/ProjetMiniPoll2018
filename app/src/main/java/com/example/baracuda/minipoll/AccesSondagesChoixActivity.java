package com.example.baracuda.minipoll;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.baracuda.minipoll.R;

/**
 * Created by Baracuda on 13/05/18.
 */

public class AccesSondagesChoixActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sondage_pour_choix_page);
    }

    public void backSPCP(View v){
        Intent intent = new Intent(this, SondagesChoixActivity.class);
        startActivity(intent);
    }

    public void cadenas(View v){
        Toast.makeText(this,"Tu as voté pour le cadenas !",Toast.LENGTH_SHORT).show();
        redirectionSC();
    }

    public void appareilPhoto(View v){
        Toast.makeText(this,"Tu as voté pour l'appareil photo !",Toast.LENGTH_SHORT).show();
        redirectionSC();
    }

    public void redirectionSC(){
        Intent intent = new Intent(this, ResultatSondagesChoixActivity.class);
        startActivity(intent);
    }

}
