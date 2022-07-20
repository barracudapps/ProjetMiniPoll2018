package com.example.baracuda.minipoll;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.baracuda.minipoll.R;

/**
 * Created by Baracuda on 17/05/18.
 */

public class ResultatQuestionnaireActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questionnaire_resultat_page);
    }

    public void quitterQRP(View v){
        Intent intent = new Intent(this, QuestionnairesActivity.class);
        startActivity(intent);
    }

}
