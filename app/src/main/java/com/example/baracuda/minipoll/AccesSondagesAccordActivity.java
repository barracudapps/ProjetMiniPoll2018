package com.example.baracuda.minipoll;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.baracuda.minipoll.R;

/**
 * Created by Baracuda on 11/05/18.
 */

public class AccesSondagesAccordActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sondage_accord);
    }

    public void backSA(View v){
        Intent intent = new Intent(this, SondagesAccordActivity.class);
        startActivity(intent);
    }

    public void proposition1SA(View v){
        Toast.makeText(this, "Tu as choisi la réponse 1.\nMerci d'avoir répondu !", Toast.LENGTH_SHORT).show();
        redirectionSA();
    }

    public void proposition2SA(View v){
        Toast.makeText(this, "Tu as choisi la réponse 2.\nMerci d'avoir répondu !", Toast.LENGTH_SHORT).show();
        redirectionSA();
    }

    public void proposition3SA(View v){
        Toast.makeText(this, "Tu as choisi la réponse 3.\nMerci d'avoir répondu !", Toast.LENGTH_SHORT).show();
        redirectionSA();
    }

    public void redirectionSA(){
        Intent intent = new Intent(this, ResultatSondagesAccordActivity.class);
        startActivity(intent);
    }

}
