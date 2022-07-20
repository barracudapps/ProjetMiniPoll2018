package com.example.baracuda.minipoll;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.baracuda.minipoll.R;

/**
 * Created by Baracuda on 17/05/18.
 */

public class ResultatSondagesChoixActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sondage_choix_resume);
    }

    public void retourSCR(View v){
        Intent intent = new Intent(this, AccesSondagesChoixActivity.class);
        startActivity(intent);
    }

    public void redirectionSCR(View v){
        Intent intent = new Intent(this, SondagesChoixActivity.class);
        startActivity(intent);
    }

}
