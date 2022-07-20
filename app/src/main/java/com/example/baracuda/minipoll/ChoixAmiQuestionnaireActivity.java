package com.example.baracuda.minipoll;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.baracuda.minipoll.R;

/**
 * Created by Baracuda on 18/05/18.
 */

public class ChoixAmiQuestionnaireActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creation_sondage_participants);
    }

    public void retourCSP(View v){
        Intent intent = new Intent(this, CreationQuestionnaireActivity.class);
        startActivity(intent);
    }

    public void validationCSP(View v){
        Intent intent = new Intent(this, PreviewQuestionActivity.class);
        startActivity(intent);
    }

}
