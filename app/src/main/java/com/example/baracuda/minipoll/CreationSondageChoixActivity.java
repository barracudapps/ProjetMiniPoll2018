package com.example.baracuda.minipoll;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.baracuda.minipoll.R;

/**
 * Created by Baracuda on 17/05/18.
 */

public class CreationSondageChoixActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creation_sondage_choix);
    }

    public void validationCSC(View v){
        Intent intent = new Intent(this, ChoixAmiSondageChoixActivity.class);
        startActivity(intent);
    }

}
