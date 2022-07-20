package com.example.baracuda.minipoll;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.baracuda.minipoll.R;

/**
 * Created by Baracuda on 18/05/18.
 */

public class PreviewQuestionActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.previsualisation_question);
    }

    public void retourPQ(View v){
        Intent intent = new Intent(this, ChoixAmiQuestionnaireActivity.class);
        startActivity(intent);
    }

    public void validerPQ(View v){
        Intent intent = new Intent(this, CreationQuizzActivity.class);
        startActivity(intent);
    }
}
