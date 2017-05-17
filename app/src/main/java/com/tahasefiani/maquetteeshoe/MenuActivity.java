package com.tahasefiani.maquetteeshoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button btnquitter;

        btnquitter = (Button)findViewById(R.id.btnquitter);

        btnquitter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                startActivity(intent);

            }
        });

        Button btnparfumer;

        btnparfumer = (Button)findViewById(R.id.btnparfumer);

        btnparfumer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {

                Intent intent = new Intent(MenuActivity.this, ParfumerActivity.class);
                startActivity(intent);

            }
        });
    }
}
