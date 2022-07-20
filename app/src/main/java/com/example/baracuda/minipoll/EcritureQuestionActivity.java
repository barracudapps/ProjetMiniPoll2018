package com.example.baracuda.minipoll;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.baracuda.minipoll.R;

/**
 * Created by Baracuda on 18/05/18.
 */

public class EcritureQuestionActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ecriture_question_questionnaire);
    }

    public void retourEQQ(View v){
        Intent intent = new Intent(this, CreationQuestionnaireActivity.class);
        startActivity(intent);
    }

    public void suivantEQQ(View v){
        Intent intent = new Intent(this, ChoixAmiQuestionnaireActivity.class);
        startActivity(intent);
    }
}
