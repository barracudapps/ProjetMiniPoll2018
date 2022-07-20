package com.example.baracuda.minipoll;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.baracuda.minipoll.R;

/**
 * Created by Baracuda on 10/05/18.
 * Fortement inspiré de l'application fournie en exemple
 */

public class QuestionnairesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liste_questionnaires_page);
    }

    public void backLQP(View v) {
        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);
    }

    public void accesQuestionnaire(View v){
        Intent intent = new Intent(this, AccesQuestionnaireActivity.class);
        startActivity(intent);
    }

}
