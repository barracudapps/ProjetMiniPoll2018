package com.example.baracuda.minipoll;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.baracuda.minipoll.R;

/**
 * Created by Baracuda on 11/05/18.
 */

public class SondagesAccordActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sondage_accord_liste);
    }

    public void backSAL(View v) {
        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);
    }

    public void accesSondageSAL(View v){
        Intent intent = new Intent(this, AccesSondagesAccordActivity.class);
        startActivity(intent);
    }
}
