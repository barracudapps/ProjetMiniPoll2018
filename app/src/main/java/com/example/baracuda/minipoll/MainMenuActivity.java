package com.example.baracuda.minipoll;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.baracuda.minipoll.R;

/**
 * Created by Baracuda on 3/05/18.
 */

public class MainMenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal_page);
    }

    public void disconnect(View v){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void account_modification(View v){
        Intent intent = new Intent(this, GestionCompteActivity.class);
        startActivity(intent);
    }

    public void friends_modification(View v){
        Intent intent  = new Intent(this, GestionAmisActivity.class);
        startActivity(intent);
    }

    public void affichageQuestionnaires(View v){
        Intent intent = new Intent(this, QuestionnairesActivity.class);
        startActivity(intent);
    }

    public void listeSondagesAccord(View v){
        Intent intent = new Intent(this, SondagesAccordActivity.class);
        startActivity(intent);
    }

    public void listeSondagesChoix(View v){
        Intent intent = new Intent(this, SondagesChoixActivity.class);
        startActivity(intent);
    }

    public void creationSondages(View v){
        Intent intent = new Intent(this, CreationQuizzActivity.class);
        startActivity(intent);
    }
}
