package com.kaisblog.de;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Website extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);

        Button asana = findViewById(R.id.btn_web_asana);
        Button m365 = findViewById(R.id.btn_web_m365);
        Button asana_guide = findViewById(R.id.btn_web_asana_guide);
        Button m365_teams = findViewById(R.id.btn_web_m365_teams);

        asana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.asana.com"));
                startActivity(browserIntent);
            }
        });

        m365.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.office.com"));
                startActivity(browserIntent);
            }
        });

        asana_guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://asana.com/de/guide"));
                startActivity(browserIntent);
            }
        });

        m365_teams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://teams.microsoft.com"));
                startActivity(browserIntent);
            }
        });

    }



}
