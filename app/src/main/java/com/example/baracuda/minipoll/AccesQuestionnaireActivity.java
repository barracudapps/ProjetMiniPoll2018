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

public class AccesQuestionnaireActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_page);
    }

    public void backQP(View v){
        Intent intent = new Intent(this, QuestionnairesActivity.class);
        startActivity(intent);
    }

    public void validerQP(View v){
        Toast.makeText(this,"Tu as choisi !",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ResultatQuestionnaireActivity.class);
        startActivity(intent);
    }

}
