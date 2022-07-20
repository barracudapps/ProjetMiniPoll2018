package com.example.baracuda.minipoll;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.baracuda.minipoll.R;

/**
 * Created by Baracuda on 20/04/18.
 */

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

    }

    public void connexion(View v){
        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);
    }

    public void inscription(View v){
        Intent intent = new Intent(this, InscriptionActivity.class);
        startActivity(intent);
    }

}
