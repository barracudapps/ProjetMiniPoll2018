package com.example.baracuda.minipoll;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.baracuda.minipoll.R;

/**
 * Created by Baracuda on 12/05/18.
 */

public class CreationQuizzActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creation_sondage);
    }

    public void retourCS(View v){
        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);
    }

    public void directionSA(View v){
        Intent intent = new Intent(this, CreationSondageAccordActivity.class);
        startActivity(intent);
    }

    public void directionSC(View v){
        Intent intent = new Intent(this, CreationSondageChoixActivity.class);
        startActivity(intent);
    }

    public void directionQ(View v){
        Intent intent = new Intent(this, CreationQuestionnaireActivity.class);
        startActivity(intent);
    }

}
