package com.example.baracuda.minipoll;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.baracuda.minipoll.R;

/**
 * Created by Baracuda on 16/05/18.
 */

public class CreationSondageAccordActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creation_sondage_accord);
    }

    public void validationCSA(View v){
        Intent intent = new Intent(this, ChoixAmiSondageAccordActivity.class);
        startActivity(intent);
    }

}
