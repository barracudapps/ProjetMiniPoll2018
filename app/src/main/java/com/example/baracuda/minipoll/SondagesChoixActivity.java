package com.example.baracuda.minipoll;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.baracuda.minipoll.R;

/**
 * Created by Baracuda on 12/05/18.
 */

public class SondagesChoixActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sondage_choix_liste);
    }

    public void backSCL(View v) {
        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);
    }

    public void accesSondageSCL(View v){
        Intent intent = new Intent(this, AccesSondagesChoixActivity.class);
        startActivity(intent);
    }

}
